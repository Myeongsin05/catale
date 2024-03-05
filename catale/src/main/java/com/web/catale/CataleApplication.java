package com.web.catale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CataleApplication {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CataleApplication.class);
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(CataleApplication.class, args);
	}

}
