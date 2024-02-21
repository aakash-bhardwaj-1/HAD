package com.example.demo.Entity.FollowUp;

import com.example.demo.Entity.common_entities.ICD10_mapping;
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
public class followUpData {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int followupid;//follow_up id is also used for token verification
    @ManyToOne
    @JoinColumn(name = "patientfieldworkermappingid")
    private patientFieldworkerMapping patientfieldworkermappingid;

    @ManyToOne
    @JoinColumn(name = "icd10")
    private ICD10_mapping icd10;

    private Boolean visited;

    private Date followupdate;

    private int doctorid;

//    @OneToOne(mappedBy = "follow_up_Id")
//    private diagnose_id_gen diagnoseIdGen;

}
