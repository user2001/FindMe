package com.example.findme.registration;

import com.example.findme.appuser.AppUser;
import com.example.findme.appuser.AppUserService;
import com.example.findme.appuser.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    public String register(RegistrationRequest request){
        return appUserService.singUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        Role.USER
                )
        );
    }
}
