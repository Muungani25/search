package com.example.registration.service.registration;

import com.example.registration.domain.User;
import com.example.registration.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UserRegistrationService {
    ResponseEntity<String> registerUser(SignUpRequest signUpRequest, Boolean isAdmin);
    List<User> returnUser();
}
