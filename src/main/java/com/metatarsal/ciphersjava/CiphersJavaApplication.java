package com.metatarsal.ciphersjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiphersJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CiphersJavaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello, Clarice.");
	}
}
