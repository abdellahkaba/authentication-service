package com.kaba.authenticationservice.auth;


import com.kaba.authenticationservice.enums.Role;
import com.kaba.authenticationservice.repository.UserRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static org.springframework.security.core.userdetails.User.*;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository ;
    private final PasswordEncoder passwordEncoder ;
    public AuthenticationResponse register(RegisterRequest request) {

        return null ;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null ;
    }
}
