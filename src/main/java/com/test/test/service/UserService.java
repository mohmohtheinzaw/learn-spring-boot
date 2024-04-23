package com.test.test.service;

import com.test.test.model.User;
import com.test.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User create(User user){
        return repository.save(user);
    }

    public List<User> getAll(){
        return repository.findAll();
    }



}

