package com.test.test.service;

import com.test.test.model.Admin;
import com.test.test.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;


    public List<Admin> getAll(){
        return repository.findAll();
    }
    public  void delete(UUID id){
         repository.deleteById(id);
    }

}
