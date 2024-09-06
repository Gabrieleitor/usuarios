package com.pruebas.usuarios.servicedatabase;

import com.pruebas.usuarios.repository.EmailRepository;
import com.pruebas.usuarios.repository.UserRepository;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveUserDatabaseService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    EmailRepository emailRepository;

    public void saveUser(User user) {
        emailRepository.sendWelcomeEmail(user);
        userRepository.saveUser(user);
    }

}
