package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;

public interface IEmailService {
    void sendWelcomeEmail(User user);
    void sendPromotionEmail(User user);
}
