package com.kursach.kep.institution.service;

import com.kursach.kep.access.jpa.AccessDAO;
import com.kursach.kep.institution.entity.Institution;
import com.kursach.kep.institution.repository.InstitutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Mr. Skip.
 */

@Service
public class InstitutionServ extends AccessDAO<Institution>{
    private InstitutionRepo institutionRepo;

    @Autowired
    public InstitutionServ(InstitutionRepo institutionRepo) {
        super(institutionRepo);
        this.institutionRepo = institutionRepo;
    }
}
