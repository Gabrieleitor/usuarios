package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        users.add(user);
        sendWelcomeEmail(user);
        saveToDatabase(user);
        return "Usuario creado: " + user;
    }

    private void sendWelcomeEmail(User user) {
        // Simulación de envío de email
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }

    private void saveToDatabase(User user) {
        // Simulación de guardado en base de datos
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }
}
