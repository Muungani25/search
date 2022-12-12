package zw.co.afrosoft.registration.controller;

import zw.co.afrosoft.registration.dto.SignInRequest;
import zw.co.afrosoft.registration.dto.SignUpRequest;
import zw.co.afrosoft.registration.service.login.UserLoginService;
import zw.co.afrosoft.registration.service.registration.UserRegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return userRegistrationService.registerUser(signUpRequest);
    }
}
