package zw.co.afrosoft.registration.service.login;

import zw.co.afrosoft.registration.dto.JwtResponse;
import zw.co.afrosoft.registration.dto.SignInRequest;
import org.springframework.http.ResponseEntity;

public interface UserLoginService {
    ResponseEntity<JwtResponse> signInUser(SignInRequest signInRequest);
}
