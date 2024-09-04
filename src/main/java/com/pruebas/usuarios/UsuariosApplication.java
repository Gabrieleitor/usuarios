package com.pruebas.usuarios;

import com.pruebas.usuarios.model.User;
import com.pruebas.usuarios.model.enums.UserType;
import com.pruebas.usuarios.service.interfaces.IDatabaseService;
import com.pruebas.usuarios.service.interfaces.IEmailService;
import com.pruebas.usuarios.service.interfaces.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsuariosApplication implements CommandLineRunner {

	@Autowired
	private IDatabaseService<User, String> databaseService;

	@Autowired
	private IEmailService emailService;

	@Autowired
	private IReportGenerator reportGenerator;

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Crear usuarios de ejemplo
		User user1 = new User("1", "John Doe", "john.doe@example.com", "xxx", UserType.MANAGER);
		User user2 = new User("2", "Jane Smith", "jane.smith@example.com", "xxx", UserType.EMPLOYEE);

		// Guardar usuarios en la base de datos
		databaseService.save(user1);
		databaseService.save(user2);
	}
}