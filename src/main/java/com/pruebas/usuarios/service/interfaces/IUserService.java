package com.pruebas.usuarios.service.interfaces;

import com.pruebas.usuarios.model.User;

import java.util.List;

// ISP - Interface Segregation Principle
// Las interfaces deben ser específicas para cada cliente
// Cumple con ISP, ya que proporciona métodos específicos para la gestión de usuarios.

public interface IUserService {
    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con la gestión de usuarios.

    void createUser(User user); // Crear un usuario

    User getUser(String id); // Obtener un usuario por ID

    void updateUser(User user); // Actualizar un usuario

    void deleteUser(String id); // Eliminar un usuario

    List<User> getAllUsers(); // Obtener todos los usuarios
}