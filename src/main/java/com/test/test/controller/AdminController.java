package com.test.test.controller;

import com.test.test.model.Admin;
import com.test.test.service.AdminService;
import com.test.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService service;

//    public AdminController(AdminService adminService) {
//        this.service = adminService;
//    }

    @GetMapping()
        public List<Admin> getAllAdmins(){
            return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")UUID id){
        service.delete(id);
    }
}
