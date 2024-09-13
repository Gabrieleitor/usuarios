package com.pruebas.usuarios.controller;

import com.pruebas.usuarios.model.User;
import com.pruebas.usuarios.model.UserType;
import com.pruebas.usuarios.service.salary.SalaryCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private SalaryCalculatorService salaryCalculatorService;

    @GetMapping
    public ResponseEntity<Double> getAllUsers(@RequestParam UserType userType) {
        applicationEventPublisher.publishEvent(userType);
        return ResponseEntity.ok(salaryCalculatorService.getSalary(userType));
    }
}
