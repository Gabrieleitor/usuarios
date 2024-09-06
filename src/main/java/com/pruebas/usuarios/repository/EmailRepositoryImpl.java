package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepositoryImpl implements EmailRepository{
    @Override
    public void sendWelcomeEmail(User user) {
        System.out.println("Enviando email de bienvenida a " + user.getEmail());
    }

    @Override
    public void sendPromotionEmail(User user) {
        System.out.println("Enviando email de promoción a " + user.getEmail());
    }
}
