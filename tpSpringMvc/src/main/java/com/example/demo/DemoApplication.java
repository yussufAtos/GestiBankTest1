package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class,
				args);

		// ApplicationContext ctx=
		// SpringApplication.run(TpSpringApplication.class, args);
		CompteRepository compteRepository = ctx.getBean(CompteRepository.class);

		compteRepository.save(new Compte("compte1", new Date()));

		compteRepository.save(new Compte("compte2", new Date()));

		compteRepository.save(new Compte("compte3", new Date()));

	}
}

