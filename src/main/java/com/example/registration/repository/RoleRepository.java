package com.example.registration.repository;

import com.example.registration.domain.ERole;
import com.example.registration.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
