package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.User;
import com.pruebas.usuarios.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDTOService {

    private final UserService userService;

    @Autowired
    public UserDTOService(UserService userService) {
        this.userService = userService;
    }
    public List<UserDTO> convertToDTOs(List<User> users) {
        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
    }
    public UserDTO convertToDTO(User user) {
        double salary = userService.calculateSalary(user);
        return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getType().name(), salary);
    }
}