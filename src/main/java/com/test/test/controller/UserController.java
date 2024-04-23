package com.test.test.controller;

import com.test.test.model.Book;
import com.test.test.model.User;
import com.test.test.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping()
    public List<User> getAll(){
        return service.getAll();
    }

    @PostMapping()
    public User create(@Valid @RequestBody User user){
        return service.create(user);
    }
}
