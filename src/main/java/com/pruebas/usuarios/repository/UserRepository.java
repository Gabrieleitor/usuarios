package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository implements IUserRepository {

    private List<User> users = new ArrayList<>();

    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con la gestión de usuarios en la base de datos.

    @Override
    public void saveUser(User user) {
        users.add(user);
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }

    @Override
    public void updateUser(User user) {
        users = users.stream().map(u -> u.getId().equals(user.getId()) ? user : u).collect(Collectors.toList());
        System.out.println("Actualizando usuario en la base de datos: " + user.getName());
    }

    @Override
    public void deleteUser(User user) {
        users = users.stream().filter(u -> !u.getName().equals(user.getName())).collect(Collectors.toList());
        System.out.println("Eliminando usuario de la base de datos: " + user.getName());
    }

    @Override
    public User findUserById(String id) {
        System.out.println("Buscando usuario en la base de datos por ID: " + id);
        return users.stream()
                .filter(u -> u.getId().trim().equals(id.trim()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}