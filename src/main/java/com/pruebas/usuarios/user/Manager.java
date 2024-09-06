package com.pruebas.usuarios.user;

public class Manager extends User {

    public UserType getType() {
        return UserType.MANAGER;
    }

    public double calculateSalary() {
        return UserType.MANAGER.getSalary();
    }
}
