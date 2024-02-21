package com.example.demo.DTO.Prescription;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class prescriptionDTO {
    private int prescriptionid;
    private String feildworker;
    private Date dateofprescription;
    private String doctorcomment;
}
