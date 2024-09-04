package com.pruebas.usuarios.service;

import com.pruebas.usuarios.repository.IUserRepository;
import com.pruebas.usuarios.service.interfaces.IReportGenerator;
import com.pruebas.usuarios.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportGeneratorUser implements IReportGenerator {

    private IUserRepository userRepository;

    // Cumple con el Principio de Inversión de Dependencias (DIP)
    // La clase depende de la abstracción IUserRepository en lugar de una implementación concreta.
    public ReportGeneratorUser(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String generateUserReport() {
        // Cumple con el Principio de Responsabilidad Única (SRP)
        // Este método se encarga únicamente de generar un reporte de usuarios.
        List<User> users = userRepository.findAll();

        StringBuilder report = new StringBuilder("Reporte de Usuarios:\n");
        for (User user : users) {
            report.append(user.toString()).append("\n");
        }

        return report.toString();
    }
}