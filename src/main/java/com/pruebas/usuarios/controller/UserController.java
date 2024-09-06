package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.service.IUserService;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
