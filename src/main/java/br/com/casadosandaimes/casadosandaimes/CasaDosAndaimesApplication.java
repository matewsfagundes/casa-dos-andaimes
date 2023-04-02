package br.com.casadosandaimes.casadosandaimes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CasaDosAndaimesApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Casa dos andaimes – API Home";

	}

	public static void main(String[] args) {
		SpringApplication.run(CasaDosAndaimesApplication.class, args);
	}
}
