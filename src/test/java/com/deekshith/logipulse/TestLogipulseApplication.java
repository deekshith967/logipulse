package com.deekshith.logipulse;

import org.springframework.boot.SpringApplication;

public class TestLogipulseApplication {

	public static void main(String[] args) {
		SpringApplication.from(LogipulseApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
