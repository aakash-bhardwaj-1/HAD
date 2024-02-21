package com.example.demo.Controller.JWTController;

import com.example.demo.Entity.JWT.loginDetails;
import com.example.demo.JWT.JwtRequestDTO;
import com.example.demo.JWT.JwtResponseDTO;
import com.example.demo.JWT.JwtHelper;
import com.example.demo.JWTService.UserdetailsService;

import com.example.demo.Repository.JWTRepository.loginDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.BadCredentialsException;

@RestController
@RequestMapping("/auth")
@CrossOrigin("http://localhost:3000")
public class AuthController {

    @Autowired
    private loginDetailsRepository repo;
    @Autowired
    private UserdetailsService userDetailsService; // typo in field name
    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JwtHelper helper;

    public AuthController(UserdetailsService userDetailsService, AuthenticationManager manager, JwtHelper helper){
        this.userDetailsService = userDetailsService;
        this.helper = helper;
        this.manager = manager;
    }

    @PostMapping("/login")
    public JwtResponseDTO login(@RequestBody JwtRequestDTO request) throws BadCredentialsException {
        try {
            // Perform authentication
            this.doAuthenticate(request.getUsername(), request.getPassword());
            // Load user details
            UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
            // Generate JWT token
            String token = helper.generateToken(userDetails);
            // Build response DTO
            JwtResponseDTO response = new JwtResponseDTO();
            response.setJwtToken(token);
            response.setUsername(userDetails.getUsername());
            return response;
        } catch (BadCredentialsException e) {
            // Handle authentication failure
            throw e;
        } catch (Exception e) {
            // Handle other exceptions
            throw e;
        }
    }

    private void doAuthenticate(String username, String password) {
        loginDetails temp = repo.findByUsername(username);
        if (temp != null) {
            // Comparing passwords using equals method
            if (password.equals(temp.getPassword())) {
                // Authentication logic if passwords match
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, password);
                manager.authenticate(authentication);
            } else {
                // Handle incorrect password
                throw new BadCredentialsException("Invalid password");
            }
        } else {
            // Handle user not found
            throw new UsernameNotFoundException("User not found");
        }
    }

}
