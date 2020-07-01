package com.merkq.ApiAlumnos;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.merkq.ApiAlumnos")
@PropertySource("claspath:database.properties")
public class AppConfig {

	
	@Autowired
	Environment ambiente;
	
	@Bean
	DataSource dataSource(){
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(ambiente.getProperty("url"));
		dmds.setUsername(ambiente.getProperty("user"));
		dmds.setPassword(ambiente.getProperty("pass"));
		dmds.setDriverClassName(ambiente.getProperty("driver"));
		return dmds;
	}
}
