package com.pruebas.usuarios.service.impl;

import com.pruebas.usuarios.repository.impl.DatabaseService;
import com.pruebas.usuarios.service.IEmailService;
import com.pruebas.usuarios.service.IUserService;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    DatabaseService databaseService;
    @Autowired
    IEmailService emailService;

    @Override
    public String createUser(User user) {
        databaseService.saveUser(user);
        emailService.sendWelcomeEmail(user);
        return "Usuario creado: " + user;
    }

    @Override
    public void updateUser(User user) {
        databaseService.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        databaseService.deleteUser(user);
    }

    @Override
    public List<User> getUsers() {
        return databaseService.getUsers();
    }

    @Override
    public double calculateSalary(User user) {
        return switch (user.getType()) {
            case EMPLOYEE -> 50000;
            case MANAGER -> 80000;
            case EXECUTIVE -> 120000;
            default -> 0;
        };
    }
}
