package com.ritual.growth.ritual.growth.repositories;

import com.ritual.growth.ritual.growth.entties.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {


    public Optional<Project> findById(Long projectId);
}
