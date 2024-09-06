package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.servicedatabase.GetUserDatabaseService;
import com.pruebas.usuarios.servicedatabase.SaveUserDatabaseService;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    SaveUserDatabaseService saveUserDatabaseService;
    @Autowired
    GetUserDatabaseService getSaveUserDatabaseService;


    @GetMapping
    public List<User> getUsers() {
        return getSaveUserDatabaseService.getUsers();
    }

    @PostMapping
    public String createUser(@RequestBody User user) {

        saveUserDatabaseService.saveUser(user);
        return "Usuario creado: " + user;

    }

}
