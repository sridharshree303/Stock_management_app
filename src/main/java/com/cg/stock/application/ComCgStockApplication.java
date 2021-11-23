package com.cg.stock.application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComCgStockApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(ComCgStockApplication.class);


	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(ComCgStockApplication.class, args);
		LOG.info("End");
	}

}
