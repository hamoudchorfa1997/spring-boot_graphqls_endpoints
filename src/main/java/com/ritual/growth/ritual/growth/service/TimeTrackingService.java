package com.ritual.growth.ritual.growth.service;

import com.ritual.growth.ritual.growth.entties.Stage;
import com.ritual.growth.ritual.growth.repositories.StageRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Data
public class TimeTrackingService {


    @Autowired
      private  StageRepository stageRepository;


   private  Map<Long, LocalDateTime> userStartTimeMap = new HashMap<>();

    public void startTracking(Long userId, Long stageId) {
        // Check if the user's stage is already being tracked
        if (!userStartTimeMap.containsKey(userId)) {
          Optional<Stage> stage = stageRepository.findById(stageId);
            if (stage != null) {
                userStartTimeMap.put(userId, LocalDateTime.now());
            } else {
                throw new IllegalArgumentException("Invalid Stage ID");
            }
        } else {
            throw new IllegalStateException("User's stage is already being tracked");
        }
    }

    // Method to stop tracking time for a user's stage and return the duration in seconds
    public Long stopTracking(Long userId, Long stageId) {
        LocalDateTime startTime = userStartTimeMap.get(userId);
        if (startTime != null) {
             Optional<Stage>  stage = stageRepository.findById(stageId);
            if (stage != null) {
                userStartTimeMap.remove(userId);
                LocalDateTime endTime = LocalDateTime.now();
                long durationInSeconds = startTime.until(endTime, java.time.temporal.ChronoUnit.SECONDS);
                return durationInSeconds;
            } else {
                throw new IllegalArgumentException("Invalid Stage ID");
            }
        } else {
            throw new IllegalStateException("User's stage is not being tracked");
        }
    }

}