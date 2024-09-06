package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;

import java.util.List;

public interface IUserService {
    public String createUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public List<User> getUsers();
    public double calculateSalary(User user);
}
