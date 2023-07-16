package com.technicaltest.dreamhotels;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.technicaltest.dreamhotels")
public class DreamHotelsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DreamHotelsApplication.class, args);
	}

	@Bean
	public OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Dream Hotels APIs")
						.description("Dreams Hotel is an application that allows you to select different rooms between different hotels.")
						.version("1.0")
						.termsOfService("http://swagger-io/terms")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));

	}
}

