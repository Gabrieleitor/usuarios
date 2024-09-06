package com.pruebas.usuarios.repository.impl;

import com.pruebas.usuarios.repository.IDatabaseService;
import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseService implements IDatabaseService {
    private final List<User> users = new ArrayList<>();

    public void saveUser(User user) {
        users.add(user);
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }

    public void updateUser(User user) {
        System.out.println("Actualizando usuario en la base de datos: " + user.getName());
    }

    public void deleteUser(User user) {
        System.out.println("Eliminando usuario de la base de datos: " + user.getName());
    }

    public List<User> getUsers() {
        return users;
    }
}
