package com.test.test.service;

import com.test.test.dto.AdminDto;
import com.test.test.model.Admin;
import com.test.test.model.User;
import com.test.test.repository.AdminRepository;
import com.test.test.repository.UserRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private ModelMapper modelMapper;

//    public AuthService(AdminRepository adminRepository) {
//        this.adminRepository = adminRepository;
//    }

//    public AuthService(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    public Admin registerAdmin(Admin admin){
        return adminRepository.save(admin);
    }

//    public Admin loginAdmin(AdminDto data){
//        System.out.println("this is username" + data.getUsername());
//        Admin admin = adminRepository.findByUsernameAndPassword(data.getUsername(), data.getPassword()).orElseThrow(()-> new NoResultException("Admin not found with this credential"));
//        //return admin;
//    }

//    public User loginUser(String phone){
//        User data = userRepository.findWithPhone(phone).orElseThrow(()-> new NoResultException("User not found with this phone"));
//        return data;
//    }

}
