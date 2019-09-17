package com.kazale.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kazale.api.services.ExemploService;

@SpringBootApplication
public class ProjServicesApplication {
	
	@Autowired
	private ExemploService exemploService;

	public static void main(String[] args) {
		SpringApplication.run(ProjServicesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			this.exemploService.testarServico();
		};
	}
}
