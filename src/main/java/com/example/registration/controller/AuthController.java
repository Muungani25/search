package com.example.registration.controller;

import com.example.registration.dto.SignInRequest;
import com.example.registration.dto.SignUpRequest;
import com.example.registration.service.login.UserLoginService;
import com.example.registration.service.registration.UserRegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private UserRegistrationService userRegistrationService;
    private UserLoginService userLoginService;

    public AuthController(UserRegistrationService userRegistrationService, UserLoginService userLoginService) {
        this.userRegistrationService = userRegistrationService;
        this.userLoginService = userLoginService;
    }
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SignInRequest signInRequest) {
        return userLoginService.signInUser(signInRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignUpRequest signUpRequest) {
        return userRegistrationService.registerUser(signUpRequest, false);
    }
//    @PostMapping("/admin/signup")
//    public ResponseEntity<String> adminSignup(@RequestBody SignUpRequest signUpRequest) {
//        return userRegistrationService.registerUser(signUpRequest, true);
//    }

}
