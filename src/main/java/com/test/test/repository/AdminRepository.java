package com.test.test.repository;

import com.test.test.dto.AdminDto;
import com.test.test.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AdminRepository extends JpaRepository<Admin, UUID> {
 //   Optional<User> findByUsername(String username);

    Optional<Admin> findByUsername(String username);
}
