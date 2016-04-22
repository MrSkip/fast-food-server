package com.kursach.kep.institution.entity;

import com.kursach.kep.entity.BaseEntity;
import com.kursach.kep.menu.entity.Menu;

import javax.persistence.*;
import java.util.List;


@Entity
public class Institution extends BaseEntity{
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String phone;
    private Integer ratingInterior;
    private Integer ratingService;
    private Integer ratingKitchen;
    private String supplements;

    @ManyToMany
    @JoinTable(
            name = "institution_menu",
            joinColumns = {@JoinColumn(name = "institution_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "menu_id", referencedColumnName = "id")}
    )
    private List<Menu> menuSet;


    public Institution() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRatingInterior() {
        return ratingInterior;
    }

    public void setRatingInterior(Integer ratingInterior) {
        this.ratingInterior = ratingInterior;
    }

    public Integer getRatingService() {
        return ratingService;
    }

    public void setRatingService(Integer ratingService) {
        this.ratingService = ratingService;
    }

    public Integer getRatingKitchen() {
        return ratingKitchen;
    }

    public void setRatingKitchen(Integer ratingKitchen) {
        this.ratingKitchen = ratingKitchen;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    public List<Menu> getMenuSet() {
        return menuSet;
    }

    public void setMenuSet(List<Menu> menuSet) {
        this.menuSet = menuSet;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "supplements='" + supplements + '\'' +
                ", ratingKitchen=" + ratingKitchen +
                ", ratingService=" + ratingService +
                ", ratingInterior=" + ratingInterior +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
