package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendWelcomeEmail(User user) {
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }
}
