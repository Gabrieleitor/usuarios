package com.pruebas.usuarios.service;

import com.pruebas.usuarios.enums.UserType;

public class CalculateSalaryService {

    public double calculateSalary(String type) {
        switch (UserType.valueOf(type)) {
            case EMPLOYEE:
                return 50000;
            case MANAGER:
                return 80000;
            case EXECUTIVE:
                return 120000;
            default:
                return 0;
        }
    }

}
