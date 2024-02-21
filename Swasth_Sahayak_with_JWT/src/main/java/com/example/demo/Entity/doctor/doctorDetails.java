package com.example.demo.Entity.doctor;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class doctorDetails {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int did;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private int mobileno;

    @Column(nullable = false)
    private Date dateofjoining;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String workingaddress;

    @Column(nullable = false)
    private int pinecode;

    @Column(nullable = false)
    private int blockcode;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private int countofpatient;

}
