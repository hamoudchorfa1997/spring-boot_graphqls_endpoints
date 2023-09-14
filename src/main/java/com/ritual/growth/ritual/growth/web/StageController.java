package com.ritual.growth.ritual.growth.web;

import com.ritual.growth.ritual.growth.entties.Stage;
import com.ritual.growth.ritual.growth.service.StageService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Data
public class StageController {


    @Autowired
    private  StageService stageService;


   @QueryMapping
   public List<Stage> listOfStages() {
        return stageService.getAllStages();
    }

    @QueryMapping
    public Stage getStageById(@Argument Long stageId){
       return stageService.getStageById(stageId);
    }
}
