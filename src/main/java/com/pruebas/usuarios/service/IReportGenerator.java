package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;

import java.util.List;

public interface IReportGenerator {
    public String generateUserReport(List<User> users);
}
