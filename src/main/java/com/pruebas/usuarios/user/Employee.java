package com.pruebas.usuarios.user;

public class Employee extends User {

    public UserType getType() {
        return UserType.EMPLOYEE;
    }

    public double calculateSalary() {
        return UserType.EMPLOYEE.getSalary();
    }
}
