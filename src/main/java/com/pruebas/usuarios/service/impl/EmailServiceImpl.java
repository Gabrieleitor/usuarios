package com.pruebas.usuarios.service.impl;

import com.pruebas.usuarios.service.EmailService;
import com.pruebas.usuarios.user.User;

public class EmailServiceImpl implements EmailService {

    public void sendEmail(String content, User user) {
        System.out.println("Enviando email de " + content + " a " + user.getEmail());
    }
}
