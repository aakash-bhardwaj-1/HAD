package com.example.demo.Entity.patient;

import jakarta.persistence.*;
import lombok.*;
import com.example.demo.Entity.FollowUp.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="patient_details")
public class PatientDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int pid;

    @Column(nullable = false,unique = true)
    private int abhaid;

    @Column(nullable = false)
    private String name;

    private int mobileno;

    @Column(nullable = false)
    private Date dob;

    @Column(nullable = false)
    private String preferredlanguage;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String Address;

    @Column(nullable = false)
    private int pincode;

    @Column(nullable = false)
    private int blockcode;

    @OneToOne(mappedBy = "patientid")
    private patientFieldworkerMapping patient;

}
