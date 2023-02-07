package br.com.querubitos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class QuerubitosApplication {
	
	@GetMapping
	public String getHomeTest() {
		return "Adolescentes - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(QuerubitosApplication.class, args);
	}
}