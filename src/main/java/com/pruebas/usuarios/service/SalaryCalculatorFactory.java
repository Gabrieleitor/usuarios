package com.pruebas.usuarios.service;

import com.pruebas.usuarios.user.UserType;
import org.springframework.stereotype.Component;

@Component
public class SalaryCalculatorFactory {

    public SalaryCalculator getCalculator(UserType userType) {
        switch (userType) {
            case EMPLOYEE:
                return new EmployeeSalaryCalculator();
            case MANAGER:
                return new ManagerSalaryCalculator();
            case EXECUTIVE:
                return new ExecutiveSalaryCalculator();
            default:
                throw new IllegalArgumentException("Tipo de usuario no soportado.");
        }
    }
}