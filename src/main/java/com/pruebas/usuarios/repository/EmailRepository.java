package com.pruebas.usuarios.repository;

import com.pruebas.usuarios.user.User;

public interface EmailRepository {

    public void sendWelcomeEmail(User user);

    public void sendPromotionEmail(User user);

}
