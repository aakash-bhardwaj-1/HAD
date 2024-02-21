package com.example.demo.Repository.Doctor;

import com.example.demo.Entity.doctor.DoctorEncryptId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorEncryptedRepository extends JpaRepository<DoctorEncryptId,Integer> {
    public DoctorEncryptId findByUsername(String s);
}
