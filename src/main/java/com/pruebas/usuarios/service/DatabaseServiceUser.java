package com.pruebas.usuarios.service;

import com.pruebas.usuarios.repository.IUserRepository;
import com.pruebas.usuarios.model.User;
import com.pruebas.usuarios.service.interfaces.IDatabaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseServiceUser implements IDatabaseService<User, String> {

    // SRP - Single Responsibility Principle
    // Solo se encarga de la lógica de negocio de los usuarios para el CRUD
    // No se encarga de la lógica de negocio de los correos

    private final IUserRepository userRepository;

    public DatabaseServiceUser(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public void update(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void delete(User user) {
        userRepository.deleteUser(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}