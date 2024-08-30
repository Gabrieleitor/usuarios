package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.user.User;

public class DatabaseService {
    public void saveUser(User user) {
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }

    public void updateUser(User user) {
        System.out.println("Actualizando usuario en la base de datos: " + user.getName());
    }

    public void deleteUser(User user) {
        System.out.println("Eliminando usuario de la base de datos: " + user.getName());
    }
}
