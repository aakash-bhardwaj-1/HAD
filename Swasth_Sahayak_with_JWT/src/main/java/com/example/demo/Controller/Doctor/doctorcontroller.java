package com.example.demo.Controller.Doctor;

import com.example.demo.DTO.Commmon.patientMetaData;
import com.example.demo.DTO.Doctor.doctordetailsDTO;
import com.example.demo.Entity.common_entities.patientDoctorMapping;
import com.example.demo.Entity.doctor.doctorDetails;
import com.example.demo.Entity.patient.PatientDetails;
import com.example.demo.Repository.CommonRepositories.patientDoctorRepository;
import com.example.demo.Repository.Doctor.DoctorEncryptedRepository;
import com.example.demo.Repository.Doctor.DoctorRepository;
import com.example.demo.Repository.Followup.followupdataRepository;
import com.example.demo.Repository.Patient.patientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
//Role: Doctor
//doctor dashboard
@RestController
@RequestMapping("/doctor")
public class doctorcontroller {
  @Autowired
  private patientDoctorRepository patientdoctorRepository;
  @Autowired
  private DoctorEncryptedRepository doctorEncryptedRepository;

  @Autowired
  private patientDetailsRepository patientDetailsRepository;

  @Autowired
  private DoctorRepository doctorrepository;
  @Autowired
  private followupdataRepository followupdataRepository;

  @GetMapping("/top3/{username}")
    public List<patientMetaData> findPatientsByCount(@PathVariable String username){
    List<patientDoctorMapping> patientid=patientdoctorRepository.findTop3ByDoctorid(doctorEncryptedRepository.findByUsername(username).getDid().getDid());
    List<patientMetaData> datatosend = new ArrayList<>();
    for (patientDoctorMapping mapping:patientid){
      patientMetaData temp = new patientMetaData();
      PatientDetails a=patientDetailsRepository.findByAbhaid(mapping.getAbhaid());
      if (a!=null){
        temp.setName(a.getName());
        temp.setPatientid(a.getPid());
        datatosend.add(temp);
      }
    }
    return datatosend;
  }

  @GetMapping("/findall/{username}")
  public List<patientMetaData> findAllPatients(@PathVariable String username){
    List<patientDoctorMapping> patientid= patientdoctorRepository.findAllByDoctorid(doctorEncryptedRepository.findByUsername(username).getDid().getDid());
    List<patientMetaData> datatosend = new ArrayList<>();
    for (patientDoctorMapping mapping:patientid){
      patientMetaData temp = new patientMetaData();
      PatientDetails a=patientDetailsRepository.findByAbhaid(mapping.getAbhaid());
      if (a!=null){
        temp.setName(a.getName());
        temp.setPatientid(a.getPid());
        datatosend.add(temp);
      }
    }
    return datatosend;
  }
  //new count on doctor dashboard
  @GetMapping("/findcount/{did}")
  public long findCount(@PathVariable String did){
    return patientdoctorRepository.countByDoctorid(doctorEncryptedRepository.findByUsername(did).getDid().getDid());
  }
  //old count
  @GetMapping("/findoldcount/{did}/{d}")
  public long findoldcount(@PathVariable String did, @PathVariable Date d){
    return followupdataRepository.countByDoctoridAndAndFollowupdate(doctorEncryptedRepository.findByUsername(did).getDid().getDid(),d);
  }
//fetching doctor details from doctor username
  @GetMapping("/getdoctordetails/{id}")
  public doctordetailsDTO getDetails(@PathVariable String id){
    doctordetailsDTO doctordetailsdto = new doctordetailsDTO();
    doctorDetails did= doctorEncryptedRepository.findByUsername(id).getDid();
    doctorDetails d=doctorrepository.findById(did.getDid()).orElse(null);
    if(d!=null) {
      doctordetailsdto.setDoctorId(id);
      doctordetailsdto.setName(d.getName());
      doctordetailsdto.setBlockCode(d.getBlockcode());
      doctordetailsdto.setSpecialization(d.getSpecialization());
    }
    else{
      System.out.println("Null value");
    }
    return doctordetailsdto;
  }
}
