package com.example.registration.service.login;

import com.example.registration.dto.JwtResponse;
import com.example.registration.dto.SignInRequest;
import org.springframework.http.ResponseEntity;

public interface UserLoginService {
    ResponseEntity<JwtResponse> signInUser(SignInRequest signInRequest);
}
