package com.example.demo.DTO.Patient;

import com.example.demo.DTO.Prescription.prescriptionDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientProfileDTO {
    private int mobileno;
    private String Address;
    private int pincode;
    private String name;
    private int patientid;
    List<prescriptionDTO> prescription;
}
