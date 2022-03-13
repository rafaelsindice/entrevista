package br.com.serasa.serasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="controller")
public class SerasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerasaApplication.class, args);
	}

}
