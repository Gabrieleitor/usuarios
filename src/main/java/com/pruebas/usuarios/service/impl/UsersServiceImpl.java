package com.pruebas.usuarios.service.impl;

import com.pruebas.usuarios.repository.DatabaseService;
import com.pruebas.usuarios.repository.impl.DatabaseServiceImpl;
import com.pruebas.usuarios.service.UsersService;
import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    DatabaseService databaseService = new DatabaseServiceImpl();

    public void saveToDatabase(User user) {
        databaseService.saveUser(user);
    }

    public void updateUser(User user) {
        databaseService.updateUser(user);
    }

    public void deleteUser(User user) {
        databaseService.deleteUser(user);
    }
}
