package com.mum.edu.controller;

import com.mum.edu.domain.User;
import com.mum.edu.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/users")
    public List<User> getAll() {
        return authenticationService.getAll();
    }
        
    @GetMapping("/users/{id}")
    public User get(@PathVariable Long id) {
        User user=  authenticationService.get(id);
        return user;
    }

    @GetMapping(value = "/authenticate", produces = "application/json")
    public User authenticate(User u){
        return authenticationService.authenticate(u.getUsername(),u.getPassword());
    }

    @PostMapping(value = "/users", consumes = "application/json")
    public RedirectView add(@RequestBody User user) {
        authenticationService.add(user);
        return new RedirectView("/users/" + user.getId());
    }

}
