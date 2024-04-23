package com.test.test.service;

import com.test.test.model.Admin;
import com.test.test.model.User;
import com.test.test.repository.AdminRepository;
import com.test.test.repository.UserRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.data.crossstore.ChangeSetPersister;

public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private ModelMapper modelMapper;

    public AuthService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Admin registerAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public Admin loginAdmin(String username,String password){
        Admin data = adminRepository.findByUsernameAndEmail(username,password).orElseThrow(()-> new NoResultException("Admin not found with this credential"));
        return data;
    }

    public User loginUser(String phone){
        User data = userRepository.findWithPhone(phone).orElseThrow(()-> new NoResultException("User not found with this phone"));
        return data;
    }

}
