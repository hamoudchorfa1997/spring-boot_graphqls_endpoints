package com.ritual.growth.ritual.growth.web;

import com.ritual.growth.ritual.growth.entties.Project;
import com.ritual.growth.ritual.growth.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @QueryMapping
    public Project getProjectById(@Argument Long projectId){
        return projectService.getProjectById(projectId);
    }

    @QueryMapping
    public List<Project> listOfProjects(){
        return projectService.getAllProjects();
    }


}
