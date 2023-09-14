package com.ritual.growth.ritual.growth.service;

import com.ritual.growth.ritual.growth.entties.Cohort;
import com.ritual.growth.ritual.growth.entties.Project;
import com.ritual.growth.ritual.growth.repositories.CohortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Controller
public class CohortService {

    @Autowired
    private CohortRepository cohortRepository;


    public List<Cohort> getAllCohorts(){
        return cohortRepository.findAll();
    }
    public Cohort getCohortById(Long cohortId){ return cohortRepository.findById(cohortId).orElse(null);}


    public List<Cohort> getCohortsByProjectId(Long projectId) {
        return cohortRepository.findByProjectId(projectId);
    }


}
