package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.service.UserDTOService;
import com.pruebas.usuarios.user.User;
import com.pruebas.usuarios.service.EmailService;
import com.pruebas.usuarios.service.UserService;
import com.pruebas.usuarios.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final EmailService emailService;
    private final UserDTOService userDTOService;


    @Autowired
    public UserController(UserService userService, EmailService emailService, UserDTOService userDTOService) {
        this.userService = userService;
        this.emailService = emailService;
        this.userDTOService = userDTOService;
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return userDTOService.convertToDTOs(userService.getAllUsers());
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        sendWelcomeEmail(user);
        saveToDatabase(user);
        return "Usuario creado: " + user;
    }

    private void sendWelcomeEmail(User user) {
        emailService.sendWelcomeEmail(user);
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }

    private void saveToDatabase(User user) {
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
        userService.saveUser(user);
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }
}
