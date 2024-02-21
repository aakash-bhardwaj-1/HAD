package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/auth")
@CrossOrigin("http://localhost:3000")
public class TestController {
    @GetMapping("/welcome")
    public String api_check(){
        return "welcome";
    }
}
