package com.pruebas.usuarios.service;

import com.pruebas.usuarios.reports.UserReportData;
import com.pruebas.usuarios.repository.UserRepository;
import com.pruebas.usuarios.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User updateUser(Long id, User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> searchUsers(String name) {
        return userRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<UserReportData> getUserReportData() {
        return userRepository.findAll().stream()
                .map(user -> new UserReportData(user.getName(), user.getEmail(), user.getType().toString()))
                .collect(Collectors.toList());
    }
}
