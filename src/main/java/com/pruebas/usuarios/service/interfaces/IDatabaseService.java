package com.pruebas.usuarios.service.interfaces;

import java.util.List;

// OCP - Open/Closed Principle
// La interfaz está abierta a la extensión pero cerrada a la modificación
// Cumple con OCP, ya que se puede extender para manejar otras operaciones relacionadas con User sin modificar el código existente.

public interface IDatabaseService<T, ID> {
    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con la gestión de la base de datos.

    void save(T entity); // Guardar una entidad

    void update(T entity); // Actualizar una entidad

    void delete(T entity); // Eliminar una entidad

    T findById(ID id); // Encontrar una entidad por ID

    List<T> findAll(); // Encontrar todas las entidades
}