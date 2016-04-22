package com.kursach.kep.menu.repository;

import com.kursach.kep.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mr. Skip.
 */

@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer>{



}
