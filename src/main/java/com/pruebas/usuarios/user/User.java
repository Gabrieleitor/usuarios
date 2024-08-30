package com.pruebas.usuarios.user;


public class User {
    private String name;
    private String email;
    private String password;
    private UserType type;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getType() {
        return type;
    }

    public double calculateSalary() {
        switch (type) {
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

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', type='" + type + "'}";
    }
}

enum UserType {
    EMPLOYEE, MANAGER, EXECUTIVE
}