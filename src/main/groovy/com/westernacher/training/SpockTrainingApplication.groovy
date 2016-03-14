package com.westernacher.training

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpockTrainingApplication {

	static void main(String[] args) {
		SpringApplication.run SpockTrainingApplication, args
	}

    @Bean
    public String sampleBean() {
        return 'Hello World!'
    }
}
