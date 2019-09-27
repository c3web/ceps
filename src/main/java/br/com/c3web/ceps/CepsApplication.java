package br.com.c3web.ceps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepsApplication.class, args);
	}

}
