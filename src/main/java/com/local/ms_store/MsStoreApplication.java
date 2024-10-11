package com.local.ms_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MsStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsStoreApplication.class, args);
	}

}
