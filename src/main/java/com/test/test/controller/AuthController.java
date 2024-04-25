package com.test.test.controller;

import com.test.test.dto.AdminDto;
import com.test.test.model.Admin;
import com.test.test.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    public AuthService authService;
    public AuthController(AuthService authService){
        this.authService = authService;
    }

//    @PostMapping("user/login")
//    public User login(@Valid @RequestBody String phone){
//        User user = authService.loginUser(phone);
//        return user;
//    }

    @PostMapping("/admin/register")
    public Admin registerAdmin(@Valid @RequestBody Admin admin){
        Admin  createdAdmin = authService.registerAdmin(admin);
        return createdAdmin;
    }

//    @PostMapping("/admin/login")
//    public Admin loginAdmin(@Valid @RequestBody AdminDto dto){
//        Admin admin = authService.loginAdmin(dto);
//        if(admin != null){
//          // String token = jwtService.generateToken(filter.);
//          //  System.out.println(token);
//        }
//        return admin;
//    }

}


