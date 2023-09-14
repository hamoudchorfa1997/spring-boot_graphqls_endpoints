package com.ritual.growth.ritual.growth.entties;

import com.ritual.growth.ritual.growth.enums.StageName;
import com.ritual.growth.ritual.growth.enums.StageStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stageId;

    @Enumerated(EnumType.STRING)
    private StageName StageName;

    @Enumerated(EnumType.STRING)
    private StageStatus stageStatus;

    @ManyToOne
    private Cohort cohortId;


    @Column
    private Date stageStartDate;

    @Column
    private Date stageEndDate;

    @Column
    private int usersIn;

    @Column
    private int usersOut;


    @ManyToMany
    private List<User> stageMembers;


    @Column
    private int NumberOfMembers;


    @Column(nullable = false)
    private int numberOfActiveUsers;

}
