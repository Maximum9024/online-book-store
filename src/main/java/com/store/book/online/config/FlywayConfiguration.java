package com.store.book.online.config;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class FlywayConfiguration {
	@Autowired
	private DataSource  dataSource;

	 @Bean
	 @DependsOn("entityManagerFactory")
	 public void flyway() {
	 Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
	    }
}
