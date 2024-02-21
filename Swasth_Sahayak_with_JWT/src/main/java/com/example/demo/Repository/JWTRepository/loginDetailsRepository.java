package com.example.demo.Repository.JWTRepository;


import com.example.demo.Entity.JWT.loginDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginDetailsRepository extends JpaRepository<loginDetails,String> {
    public loginDetails findByUsername(String usr);
}
