package com.pruebas.usuarios.service;

import com.pruebas.usuarios.repository.IUserRepository;
import com.pruebas.usuarios.service.interfaces.IEmailService;
import com.pruebas.usuarios.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceUser implements IEmailService {

    // SRP - Single Responsibility Principle
    // Solo se encarga de enviar emails a los usuarios
    @Autowired
    private IUserRepository userRepository;

    // DIP - Dependency Inversion Principle
    // La clase depende de la abstracción IUserRepository en lugar de una implementación concreta.
    @Override
    public void sendWelcomeEmail(String id) {
        User user = userRepository.findUserById(id);
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }

    @Override
    public void sendPromotionEmail(String id) {
        User user = userRepository.findUserById(id);
        System.out.println("Enviando email de promoción a " + user.getId());
    }
}