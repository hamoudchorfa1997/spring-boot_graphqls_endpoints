package com.ritual.growth.ritual.growth.web;

import com.ritual.growth.ritual.growth.entties.Cohort;
import com.ritual.growth.ritual.growth.entties.Project;
import com.ritual.growth.ritual.growth.repositories.CohortRepository;
import com.ritual.growth.ritual.growth.repositories.ProjectRepository;
import com.ritual.growth.ritual.growth.repositories.StageRepository;

import com.ritual.growth.ritual.growth.service.CohortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class CohortController {

    @Autowired
    private CohortService cohortService;


  @QueryMapping
  public Cohort getCohortById(@Argument Long cohortId){
      return cohortService.getCohortById(cohortId);}


  @QueryMapping
  public List<Cohort> getCohortByProjectId(@Argument Long projectId){
     return cohortService.getCohortsByProjectId(projectId);
  }

   @QueryMapping
   public List<Cohort> listOfCohorts(){
        return cohortService.getAllCohorts();
    }


}
