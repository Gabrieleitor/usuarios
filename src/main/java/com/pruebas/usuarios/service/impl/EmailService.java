package com.pruebas.usuarios.service.impl;

import com.pruebas.usuarios.service.IEmailService;
import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {

    public void sendWelcomeEmail(User user) {
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }

    public void sendPromotionEmail(User user) {
        System.out.println("Enviando email de promoción a " + user.getEmail());
    }
}
