package zw.co.afrosoft.registration.service.registration;

import zw.co.afrosoft.registration.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;

public interface UserRegistrationService {
    ResponseEntity<String> registerUser(SignUpRequest signUpRequest);
}
