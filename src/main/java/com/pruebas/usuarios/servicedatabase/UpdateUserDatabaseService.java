package com.pruebas.usuarios.servicedatabase;

import com.pruebas.usuarios.repository.UserRepository;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserDatabaseService {

    @Autowired
    UserRepository userRepository;

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

}
