package com.pruebas.usuarios.service;

import com.pruebas.usuarios.model.User;
import com.pruebas.usuarios.reports.UserReportData;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User getUser(Long id);
    List<User> getAllUsers();
    List<User> searchUsers(String name);
    List<UserReportData> getUserReportData();
}
