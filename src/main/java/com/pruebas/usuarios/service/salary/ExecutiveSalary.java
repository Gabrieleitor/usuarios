package com.pruebas.usuarios.service.salary;

import com.pruebas.usuarios.model.UserType;
import org.springframework.stereotype.Component;

@Component
public class ExecutiveSalary implements SalaryCalculator {
    private double salary = 120000;
    private UserType type = UserType.EXECUTIVE;

    @Override
    public UserType getType() {
        return type;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
