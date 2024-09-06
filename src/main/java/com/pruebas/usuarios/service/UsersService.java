package com.pruebas.usuarios.service;

import com.pruebas.usuarios.repository.DatabaseService;
import com.pruebas.usuarios.repository.impl.DatabaseServiceImpl;
import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {

    public void saveToDatabase(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
