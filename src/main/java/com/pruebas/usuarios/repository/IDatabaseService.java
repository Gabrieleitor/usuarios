package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.user.User;

import java.util.List;

public interface IDatabaseService {
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public List<User> getUsers();
}
