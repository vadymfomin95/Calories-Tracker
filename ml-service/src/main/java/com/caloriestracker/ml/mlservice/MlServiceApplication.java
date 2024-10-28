package com.caloriestracker.ml.mlservice;

import com.caloriestracker.ml.mlservice.configuration.MlConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MlConfigurationProperties.class)
public class MlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MlServiceApplication.class, args);
	}

}
