package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.model.User;

import java.util.List;

// ISP - Interface Segregation Principle
// Las interfaces deben ser específicas para cada cliente
// Cumple con ISP, ya que proporciona métodos específicos para la gestión de usuarios.

public interface IUserRepository {
    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con la gestión de usuarios en la base de datos.

    void saveUser(User user); // Guardar un usuario

    void updateUser(User user); // Actualizar un usuario

    void deleteUser(User user); // Eliminar un usuario

    User findUserById(String id); // Encontrar un usuario por ID

    List<User> findAll(); // Encontrar todos los usuarios
}