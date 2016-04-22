package com.kursach.kep.menu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kursach.kep.entity.BaseEntity;
import com.kursach.kep.institution.entity.Institution;

import javax.persistence.*;
import java.util.List;

@Entity
public class Menu extends BaseEntity{
    @Id
    @GeneratedValue
    private Integer id;
    private String nameOfKitchen;
    private String nameOfSnack;
    private String storage;
    private Double weight;
    private Double coast;

    public Menu() {
    }

        @ManyToMany(mappedBy = "menuSet")
    @JsonIgnore
    private List<Institution> institutionSet;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfKitchen() {
        return nameOfKitchen;
    }

    public void setNameOfKitchen(String nameOfKitchen) {
        this.nameOfKitchen = nameOfKitchen;
    }

    public String getNameOfSnack() {
        return nameOfSnack;
    }

    public void setNameOfSnack(String nameOfSnack) {
        this.nameOfSnack = nameOfSnack;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getCoast() {
        return coast;
    }

    public void setCoast(Double coast) {
        this.coast = coast;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Institution> getInstitutionSet() {
        return institutionSet;
    }

    public void setInstitutionSet(List<Institution> institutionSet) {
        this.institutionSet = institutionSet;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", nameOfKitchen='" + nameOfKitchen + '\'' +
                ", nameOfSnack='" + nameOfSnack + '\'' +
                ", storage='" + storage + '\'' +
                ", weight=" + weight +
                ", coast=" + coast +
                '}';
    }
}
