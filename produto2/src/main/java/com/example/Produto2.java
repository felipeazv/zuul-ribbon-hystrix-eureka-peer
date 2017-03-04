package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class Produto2 {

	public static void main(String[] args) {
		SpringApplication.run(Produto2.class, args);
	}
}

@RestController
class Produto2Controller {
	@Autowired
	private Environment environment;

	@RequestMapping(value = "/consulta")
	public String olar() {
		String port = this.environment.getProperty("local.server.port");
		
		List<String> numero = Arrays.asList("DE BOA NA LAGOA", "BELEZA NA CORRENTEZA", "SUSSA NA MONTANHA RUSSA");
		Random rand = new Random();

		int randomNum = rand.nextInt(numero.size());
		return "{PRODUTO2... port:" + port + " } IAEW JAO, " + numero.get(randomNum);
	}
}