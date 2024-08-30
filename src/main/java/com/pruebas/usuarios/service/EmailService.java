package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;

public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }

    public void sendPromotionEmail(User user) {
        System.out.println("Enviando email de promoción a " + user.getEmail());
    }
}
