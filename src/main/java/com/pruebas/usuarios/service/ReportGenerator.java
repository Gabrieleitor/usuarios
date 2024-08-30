package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;

import java.util.List;

public class ReportGenerator {
    public String generateUserReport(List<User> users) {
        StringBuilder report = new StringBuilder("Reporte de Usuarios:\n");
        for (User user : users) {
            report.append(user.toString()).append("\n");
        }
        return report.toString();
    }
}
