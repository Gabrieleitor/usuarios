package com.pruebas.usuarios.service.salary;

import com.pruebas.usuarios.model.UserType;
import org.springframework.stereotype.Component;

@Component
public class ManagerSalary implements SalaryCalculator {

    private double salary = 80000;
    private UserType type = UserType.MANAGER;


    @Override
    public UserType getType() {
        return type;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
