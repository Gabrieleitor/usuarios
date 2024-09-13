package com.pruebas.usuarios.service;
import com.pruebas.usuarios.repository.UserRepository;
import com.pruebas.usuarios.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final SalaryCalculatorFactory salaryCalculatorFactory;


    @Autowired
    public UserService(UserRepository userRepository, SalaryCalculatorFactory salaryCalculatorFactory) {
        this.userRepository = userRepository;
        this.salaryCalculatorFactory = salaryCalculatorFactory;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public double calculateSalary(User user) {
        SalaryCalculator salaryCalculator = salaryCalculatorFactory.getCalculator(user.getType());
        return salaryCalculator.calculateSalary();
    }
}