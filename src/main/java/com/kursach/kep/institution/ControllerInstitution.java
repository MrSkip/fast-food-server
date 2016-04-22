package com.kursach.kep.institution;

import com.kursach.kep.access.rest.RestBase;
import com.kursach.kep.institution.entity.Institution;
import com.kursach.kep.institution.service.InstitutionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr. Skip.
 */

@RestController
@RequestMapping("/institution")
public class ControllerInstitution extends RestBase<Institution>{

    private InstitutionServ institutionServ;

    @Autowired
    public ControllerInstitution(InstitutionServ institutionServ) {
        super(institutionServ);
        this.institutionServ = institutionServ;

    }
}
