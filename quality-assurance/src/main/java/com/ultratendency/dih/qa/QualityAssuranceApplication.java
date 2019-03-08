package com.ultratendency.dih.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ultratendency.dih.qa")
public class QualityAssuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualityAssuranceApplication.class, args);
	}
}
