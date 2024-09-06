package com.pruebas.usuarios.servicedatabase;

import com.pruebas.usuarios.repository.UserRepository;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserDatabaseService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.getUsers();
    }

}
