package com.natwest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration("com.natwest.entity")
//@EnableAutoConfiguration("com.natwest.entity");
//@ComponentScan("com.natwest.entity.CurrencyExchange")
public class MulticurrencytransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(MulticurrencytransferApplication.class, args);
	}

}
