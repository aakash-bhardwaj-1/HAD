package com.example.demo.Repository.Prescription;

import com.example.demo.Entity.patient.prescriptionTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface prescriptionRepository extends JpaRepository<prescriptionTable,Integer> {
    prescriptionTable findByPid(int pid);
}
