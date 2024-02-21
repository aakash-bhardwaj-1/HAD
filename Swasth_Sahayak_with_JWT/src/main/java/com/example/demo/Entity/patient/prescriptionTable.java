package com.example.demo.Entity.patient;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="prescription_Table")
public class prescriptionTable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int prescription_id;

    @Column(nullable = false)
    private int pid;

    @Column(nullable = false)
    private Date prescriptiondate;

    @Column(nullable = false,length = 5000)
    private String prescription;


    @Column(nullable = false,length = 1000)
    private String doctorcomment;


    @Column(nullable = false)
    private String diseasename;


//    @Column(nullable = false)
//    private int questionnaireid;

    @Column(nullable = false)
    private int doctorid;


//    @Column(nullable = false)
//    private int diagnosisid;


}
