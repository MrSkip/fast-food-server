package com.kursach.kep.institution.repository;

import com.kursach.kep.institution.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mr. Skip.
 */

@Repository
public interface InstitutionRepo extends JpaRepository<Institution, Integer> {


}
