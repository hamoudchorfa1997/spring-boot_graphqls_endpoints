package com.ritual.growth.ritual.growth.service;

import com.ritual.growth.ritual.growth.entties.Cohort;
import com.ritual.growth.ritual.growth.entties.Project;
import com.ritual.growth.ritual.growth.entties.User;
import com.ritual.growth.ritual.growth.repositories.CohortRepository;
import com.ritual.growth.ritual.growth.repositories.ProjectRepository;
import com.ritual.growth.ritual.growth.repositories.StageRepository;
import com.ritual.growth.ritual.growth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class ProjectService {




 ;
    @Autowired
    private ProjectRepository projectRepository;


    public Project getProjectById(Long projectId){
        return projectRepository.findById(projectId).orElse(null);
    }

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }







}
