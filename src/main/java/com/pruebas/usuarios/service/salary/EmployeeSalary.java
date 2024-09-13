package com.pruebas.usuarios.service.salary;

import com.pruebas.usuarios.model.UserType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmployeeSalary implements SalaryCalculator {

    private double salary = 50000;
    private UserType type = UserType.EMPLOYEE;


    @Override
    public UserType getType() {
        return type;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
