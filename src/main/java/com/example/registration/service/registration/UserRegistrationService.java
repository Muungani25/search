package com.example.registration.service.registration;

import com.example.registration.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;


public interface UserRegistrationService {
    ResponseEntity<String> registerUser(SignUpRequest signUpRequest, Boolean isAdmin);
}
