package com.pruebas.usuarios.service;

import com.pruebas.usuarios.model.User;
import com.pruebas.usuarios.model.UserType;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public void sendWelcomeEmail(UserType userType) {
        System.out.println("se envía el email de " + userType.name());

    }
}
