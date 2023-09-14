package com.ritual.growth.ritual.growth.entties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @Column(nullable = false)
    private String projectName;


    @OneToMany
    private List<Cohort> listOfCohorts;

    @Column(nullable = false)
    private int numberOfActiveCohorts;

    @Column(nullable = false)
    private int numberOfCompletedCohorts;

}
