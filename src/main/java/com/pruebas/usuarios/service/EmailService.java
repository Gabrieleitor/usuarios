package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;

public interface EmailService {
    public void sendEmail(String content, User user);
}
