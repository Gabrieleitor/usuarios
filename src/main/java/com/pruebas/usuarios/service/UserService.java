package com.pruebas.usuarios.service;

import com.pruebas.usuarios.model.User;
import com.pruebas.usuarios.service.interfaces.IDatabaseService;
import com.pruebas.usuarios.service.interfaces.IEmailService;
import com.pruebas.usuarios.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    // SRP - Single Responsibility Principle
    // Solo se encarga de la lógica de negocio de los usuarios
    private final IDatabaseService<User, String> databaseService;
    private final IEmailService emailService;

    // DIP - Dependency Inversion Principle
    // La clase depende de abstracciones (interfaces) en lugar de implementaciones concretas.
    public UserService(IDatabaseService<User, String> databaseService, IEmailService emailService) {
        this.databaseService = databaseService;
        this.emailService = emailService;
    }

    @Override
    public void createUser(User user) {
        // SRP - Este método se encarga únicamente de la creación de usuarios.
        databaseService.save(user);
        emailService.sendWelcomeEmail(user.getId());
    }

    @Override
    public User getUser(String id) {
        // SRP - Este método se encarga únicamente de obtener un usuario por ID.
        return databaseService.findById(id);
    }

    @Override
    public void updateUser(User user) {
        // SRP - Este método se encarga únicamente de actualizar un usuario.
        databaseService.update(user);
    }

    @Override
    public void deleteUser(String id) {
        // SRP - Este método se encarga únicamente de eliminar un usuario.
        User user = databaseService.findById(id);
        databaseService.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        // SRP - Este método se encarga únicamente de obtener todos los usuarios.
        return databaseService.findAll();
    }
}