package com.example.demo.Repository.Patient;

import com.example.demo.Entity.patient.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientDetailsRepository extends JpaRepository<PatientDetails, Integer> {
    PatientDetails findByAbhaid(int abha_id);
}
