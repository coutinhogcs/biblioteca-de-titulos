package com.gcprojects.buscadefilmes;

import com.gcprojects.buscadefilmes.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuscaDeFilmesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuscaDeFilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
