package com.kursach.kep.entity;

import java.io.Serializable;

/**
 * by Mr Skip on 19.03.2016.
 */

public class BaseEntity implements Serializable{

    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
