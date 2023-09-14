package com.ritual.growth.ritual.growth.entties;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name ="cohort")
public class Cohort {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cohortId;

    @ManyToMany
    private List<User> users;


    @Column(nullable = false)
    private String cohortName;

    //@ManyToOne
    //@JoinColumn(name = "project_id")
   // private Project projectId;

    @Column
    private Long projectId;

    @Column(nullable = false)
    private Date cohortStartDate;

    @Column(nullable = false)
    private Date cohortEndDate;



    @Column(nullable = false)
    private int numberOfCompletedStages;


}
