package com.pruebas.usuarios.service.impl;

import com.pruebas.usuarios.service.ReportGenerator;
import com.pruebas.usuarios.user.User;

import java.util.List;

public class ReportGeneratorImpl implements ReportGenerator {

    public String generateUserReport(List<User> users) {
        StringBuilder report = new StringBuilder("Reporte de Usuarios:\n");
        for (User user : users) {
            report.append(user.toString()).append("\n");
        }
        return report.toString();
    }
}
