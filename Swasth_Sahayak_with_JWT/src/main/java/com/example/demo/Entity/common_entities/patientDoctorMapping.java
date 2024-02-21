package com.example.demo.Entity.common_entities;

import jakarta.persistence.*;
import lombok.*;
//table for free visits.

//if patient is not registered, first patient will be registered and entry will be made patient details
//in this table, there will be an entry for the selected doctor and abha id of patient.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
public class patientDoctorMapping {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int surrogate;
@Column(nullable = false)
    private int doctorid;
@Column(nullable = false)
    private int abhaid;

}
