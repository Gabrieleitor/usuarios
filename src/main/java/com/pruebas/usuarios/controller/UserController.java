package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.service.EmailService;
import com.pruebas.usuarios.service.UsersService;
import com.pruebas.usuarios.service.impl.EmailServiceImpl;
import com.pruebas.usuarios.service.impl.UsersServiceImpl;
import com.pruebas.usuarios.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();
    private EmailService emailService = new EmailServiceImpl();
    private UsersService usersService = new UsersServiceImpl();

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        users.add(user);
        emailService.sendEmail("bienvenida", user);
        usersService.saveToDatabase(user);
        return "Usuario creado: " + user;
    }
}
