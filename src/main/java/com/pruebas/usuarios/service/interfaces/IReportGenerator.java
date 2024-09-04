package com.pruebas.usuarios.service.interfaces;

// ISP - Interface Segregation Principle
// Las interfaces deben ser específicas para cada cliente
// Cumple con ISP, ya que proporciona un método específico para la generación de reportes.

public interface IReportGenerator {
    // SRP - Single Responsibility Principle
    // El método tiene una única responsabilidad relacionada con la generación de reportes de usuarios.

    String generateUserReport(); // Generar reporte de usuarios
}