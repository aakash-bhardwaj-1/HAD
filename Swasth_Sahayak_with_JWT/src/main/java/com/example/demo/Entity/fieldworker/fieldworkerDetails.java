package com.example.demo.Entity.fieldworker;

import com.example.demo.Entity.FollowUp.patientFieldworkerMapping;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class fieldworkerDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int fid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private int mobileno;

//    @Column(nullable = false)
//    private Date dob;

    @Column(nullable = false)
    private String gender;

//    @Column(nullable = false)
//    private String Address;
//
//    @Column(nullable = false)
//    private int pincode;
//
//    @Column(nullable = false)
//    private int blockcode;

    @OneToMany(mappedBy = "fieldworkerid")
    private List<patientFieldworkerMapping> fieldworkerid;
}
