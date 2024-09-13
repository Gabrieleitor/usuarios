package com.pruebas.usuarios.service.salary;

import com.pruebas.usuarios.model.UserType;

public interface SalaryCalculator {
    UserType getType();
    double calculateSalary();
}
