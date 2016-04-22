package com.kursach.kep.access.jpa;

import java.util.List;

/**
 * by Mr Skip on 19.03.2016.
 */

public interface IAccessDAO<S> {

    S update(S s);
    void delete(Long id);
    S getOne(Long id);
    List<S> getAll();
    S save(S s);

}
