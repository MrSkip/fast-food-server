package com.kursach.kep.menu.service;

import com.kursach.kep.access.jpa.AccessDAO;
import com.kursach.kep.menu.entity.Menu;
import com.kursach.kep.menu.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Mr. Skip.
 */

@Service
public class MenuServ extends AccessDAO<Menu>{
    private MenuRepo menuRepo;

    @Autowired
    public MenuServ(MenuRepo menuRepo) {
        super(menuRepo);
        this.menuRepo = menuRepo;
    }
}
