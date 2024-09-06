package com.pruebas.usuarios.user;

public class Executive extends User {

    public UserType getType() {
        return UserType.EXECUTIVE;
    }

    public double calculateSalary() {
        return UserType.EXECUTIVE.getSalary();
    }
}
