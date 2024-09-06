package com.pruebas.usuarios.user;

public enum UserType {
    EMPLOYEE("Employee", 50000),
    MANAGER("Manager", 80000),
    EXECUTIVE("Executive", 120000);

    private final String type;
    private final int salary;

    UserType(String type, int salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public int getSalary() {
        return salary;
    }
}
