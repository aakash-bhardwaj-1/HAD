package com.example.demo.DTO.JWT;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

@Data
public class LoginDTO {
    private String username;
    private String password;
    private String role;
}
