package com.example.demo.Entity.JWT;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class loginDetails {
    @Id
    private String username;
    private String password;
    private String role;

}
