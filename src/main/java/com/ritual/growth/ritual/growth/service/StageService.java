package com.ritual.growth.ritual.growth.service;

import com.ritual.growth.ritual.growth.entties.Stage;
import com.ritual.growth.ritual.growth.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;

@Service
public class StageService {

    @Autowired
    private StageRepository stageRepository;


    public List<Stage> getAllStages(){
        return stageRepository.findAll();
    }

    public Stage getStageById(Long stageId){
        return stageRepository.findById(stageId).orElse(null);
    }

}
