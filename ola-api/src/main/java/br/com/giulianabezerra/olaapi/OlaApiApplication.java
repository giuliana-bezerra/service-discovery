package br.com.giulianabezerra.olaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OlaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaApiApplication.class, args);
	}

}

@RestController
@RequestMapping("ola")
class OlaController {

	@GetMapping
	public String ola() {
		return "Olá, Mundo!";
	}

}
