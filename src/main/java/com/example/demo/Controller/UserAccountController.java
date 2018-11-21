package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @GetMapping("/forgotpassword")
    public String forgotpassword(){
        return "forgotpassword";
    }



}
