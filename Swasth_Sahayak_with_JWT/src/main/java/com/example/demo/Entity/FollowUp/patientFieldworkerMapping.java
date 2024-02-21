package com.example.demo.Entity.FollowUp;

import com.example.demo.Entity.fieldworker.fieldworkerDetails;
import com.example.demo.Entity.patient.PatientDetails;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class patientFieldworkerMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pfid;  //patient-fieldworker ID

    @OneToOne
    @JoinColumn(name = "patientid",nullable = false)
    private PatientDetails patientid;

    @ManyToOne
    @JoinColumn(name = "fieldworkerid",nullable = false)
    private fieldworkerDetails fieldworkerid;

    @OneToMany(mappedBy = "patientfieldworkermappingid")
    private List<followUpData> followupdata;
}
