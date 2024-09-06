package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.user.User;

public interface DatabaseService {
    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
