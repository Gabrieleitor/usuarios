package com.pruebas.usuarios.servicedatabase;

import com.pruebas.usuarios.repository.UserRepository;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserDatabaseService {

    @Autowired
    UserRepository userRepository;

    public void deleteUser(User user) {
        userRepository.deleteUser(user);
    }

}
