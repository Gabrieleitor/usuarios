package com.pruebas.usuarios.service.salary;

import com.pruebas.usuarios.model.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SalaryCalculatorService {

    @Autowired
    private Set<SalaryCalculator> calculators;

    public double getSalary(UserType userType) {
        return calculators.stream()
                .filter(salary -> salary.getType() == userType)
                .findFirst()
                .map(SalaryCalculator::calculateSalary).orElse(0.0);
    }
}
