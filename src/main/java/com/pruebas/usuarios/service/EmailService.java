package com.pruebas.usuarios.service;

import com.pruebas.usuarios.model.UserType;
import org.springframework.context.event.EventListener;

public interface EmailService {

    @EventListener
    void sendWelcomeEmail(UserType userType);
}
