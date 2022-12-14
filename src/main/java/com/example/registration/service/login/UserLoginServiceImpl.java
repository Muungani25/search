package com.example.registration.service.login;

import com.example.registration.dto.JwtResponse;
import com.example.registration.dto.SignInRequest;
import com.example.registration.service.UserDetailsImpl;
import com.example.registration.util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserLoginServiceImpl implements UserLoginService{

    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;


    public UserLoginServiceImpl(
            AuthenticationManager authenticationManager,
                                JwtUtil jwtUtil) {

        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public ResponseEntity<JwtResponse> signInUser(SignInRequest signInRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtil.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        JwtResponse res = new JwtResponse();
       res.setToken(jwt);
        res.setId(userDetails.getId());

        res.setUsername(userDetails.getUsername());
        res.setRoles(roles);
        return  ResponseEntity.ok(res);
    }
}
