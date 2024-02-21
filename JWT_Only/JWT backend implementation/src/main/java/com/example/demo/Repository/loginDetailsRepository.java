package com.example.demo.Repository;

import com.example.demo.DTO.LoginDTO;
import com.example.demo.Entity.loginDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginDetailsRepository extends JpaRepository<loginDetails,String> {
    public loginDetails findByUsername(String usr);
}
