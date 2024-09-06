package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Override
    public void saveUser(User user) {
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }

    @Override
    public void updateUser(User user) {
        System.out.println("Actualizando usuario en la base de datos: " + user.getName());
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("Eliminando usuario de la base de datos: " + user.getName());
    }

    @Override
    public List<User> getUsers() {
        //Esto hace las veces de la busqueda en DB
        List<User> users = new ArrayList<>();
        return users;
    }
}
