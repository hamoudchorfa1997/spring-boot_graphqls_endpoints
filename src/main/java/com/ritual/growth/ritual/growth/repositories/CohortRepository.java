package com.ritual.growth.ritual.growth.repositories;

import com.ritual.growth.ritual.growth.entties.Cohort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CohortRepository extends JpaRepository<Cohort, Long> {
    public Optional<Cohort> findById(Long cohortId);

    List<Cohort> findByProjectId(Long projectId);

}
