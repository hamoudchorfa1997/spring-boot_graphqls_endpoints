package com.ritual.growth.ritual.growth.repositories;

import com.ritual.growth.ritual.growth.entties.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {



}

