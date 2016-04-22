package com.kursach.kep.access.jpa;

import com.kursach.kep.entity.BaseEntity;
import com.kursach.kep.exception.ExceptionMySQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * by Mr Skip on 19.03.2016.
 */

@EnableTransactionManagement(proxyTargetClass = true)
public class AccessDAO<S extends BaseEntity> implements IAccessDAO<S> {
    private Logger log = LoggerFactory.getLogger(getClass());

    private String objectName = "entry";

    private JpaRepository repo;

    public AccessDAO(JpaRepository jpaRepository){
        repo = jpaRepository;
        objectName = ((Class<S>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])
                .getSimpleName();
    }

    @Override
    public S update(S s) throws ExceptionMySQL{

        if (s.getId() <= 0)
            throw new ExceptionMySQL(
                    "Can`t update " + objectName + " with id '" + s.getId() + "'. Invalid id.");
        if (!repo.exists(s.getId())){
            throw new ExceptionMySQL(
                    "Can`t update " + objectName + ". " + objectName + " with id '" + s.getId() + "', not exist.");
        }

        return save(s);
    }

    @Override
    public void delete(Long id) throws ExceptionMySQL{
        log.info("Delete one " + objectName + " with id '" + id + "'");

        if (!repo.exists(id))
            throw new ExceptionMySQL(objectName + " was not found with id `" + id + "`");
        try{
            repo.delete(id);
        } catch (DataAccessException e){
            throw new ExceptionMySQL(e.getRootCause().getMessage());
        }
    }

    @Override
    public S getOne(Long id) throws ExceptionMySQL{
        log.info("Finding " + objectName + " with id '{}'", id);
        S s;
        try {
            s = (S) repo.findOne(id);
            if (s == null)
                throw new ExceptionMySQL("Can`t find " + objectName + " with id '" + id + "'");
        } catch (DataAccessException e){
            throw new ExceptionMySQL(e.getRootCause().getMessage());
        }
        return s;
    }

    @Override
    @Transactional(readOnly = true)
    public List<S> getAll() {
        List<S> list = repo.findAll();
        log.info("Get all " + objectName + ", count `{}`", list.size());
        return list;
    }

    @Override
    public S save(S s) throws ExceptionMySQL{
        log.info("Saving " + objectName + " with id `{}`", s.getId());
        try{
            return (S) repo.save(s);
        }catch (DataAccessException e){
            throw new ExceptionMySQL(e.getRootCause().getMessage());
        }
    }

}
