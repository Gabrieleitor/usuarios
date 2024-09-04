package com.pruebas.usuarios.service.interfaces;

// ISP - Interface Segregation Principle
// Las interfaces deben ser específicas para cada cliente
// Cumple con ISP, ya que proporciona métodos específicos para el envío de correos electrónicos.

public interface IEmailService {
    // SRP - Single Responsibility Principle
    // Cada método tiene una única responsabilidad relacionada con el envío de correos electrónicos.

    void sendWelcomeEmail(String id); // Enviar email de bienvenida

    void sendPromotionEmail(String id); // Enviar email de promoción
}