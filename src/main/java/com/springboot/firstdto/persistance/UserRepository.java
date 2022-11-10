package com.springboot.firstdto.persistance;

import com.springboot.firstdto.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
