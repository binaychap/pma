package org.pma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class PmaApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(PmaApplication.class, args);
//	}
//}

@SpringBootApplication
public class PmaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PmaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PmaApplication.class, args);
	}
}
