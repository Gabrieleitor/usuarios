package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.service.interfaces.IUserService;
import com.pruebas.usuarios.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con la gestión de usuarios a través de la API.

    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "Usuario creado: " + user;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "Usuario actualizado: " + user;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return "Usuario eliminado: " + id;
    }
}