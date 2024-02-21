package com.example.demo.Entity.FollowUp;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class VisitsToReschedule {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int visitedid;

    private int followupid;//follow_up id is also used for token verification
    //mapping
    private int patientfieldworkermappingid;

    @Column(nullable = false)
    private String icd10;

    private Boolean visited;

    private Date followupdate;//supervisor will edit this field with the new date

    private int doctorid;
}
