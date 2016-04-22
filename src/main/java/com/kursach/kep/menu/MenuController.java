package com.kursach.kep.menu;

import com.kursach.kep.access.jpa.AccessDAO;
import com.kursach.kep.access.rest.RestBase;
import com.kursach.kep.menu.entity.Menu;
import com.kursach.kep.menu.service.MenuServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr. Skip.
 */

@RestController
@RequestMapping("/menu")
public class MenuController extends RestBase<Menu>{

    private MenuServ menuServ;

    @Autowired
    public MenuController(MenuServ menuServ) {
        super(menuServ);
        this.menuServ = menuServ;
    }
}
