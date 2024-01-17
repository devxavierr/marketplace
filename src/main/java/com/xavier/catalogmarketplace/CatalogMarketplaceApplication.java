package com.xavier.catalogmarketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
@SpringBootApplication
public class CatalogMarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogMarketplaceApplication.class, args);
	}

}
