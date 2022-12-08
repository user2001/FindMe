package com.example.findme.registration;

import com.example.findme.exception.UserAlreadyExistException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        try {
            return registrationService.register(request);
        } catch (UserAlreadyExistException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
