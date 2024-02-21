package com.example.demo.Repository.Doctor;

import com.example.demo.Entity.doctor.doctorDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;


public interface DoctorRepository extends JpaRepository<doctorDetails,Integer> {

}
