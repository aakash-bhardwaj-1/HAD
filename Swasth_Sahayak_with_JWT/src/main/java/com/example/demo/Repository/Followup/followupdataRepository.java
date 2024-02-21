package com.example.demo.Repository.Followup;

import com.example.demo.Entity.FollowUp.followUpData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface followupdataRepository extends JpaRepository<followUpData,Integer> {
    long countByDoctoridAndAndFollowupdate(int did, Date d);
}
