package br.com.fiap.moneyminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Controller
public class MoneyminderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyminderApplication.class, args);
	}

	@RequestMapping
	public String home("/home"){
		return "Página inicial";
	}

}
