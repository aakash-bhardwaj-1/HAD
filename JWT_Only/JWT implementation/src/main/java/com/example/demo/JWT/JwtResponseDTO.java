package com.example.demo.JWT;

import lombok.Data;

@Data
public class JwtResponseDTO {
    private String username;
    private String role;
    private String jwtToken;
}
