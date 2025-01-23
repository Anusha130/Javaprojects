package com.mds.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;



@Configuration
public class MySQLDataSourceConfiguration {

	//@Qualifier
	@ConfigurationProperties("spring.datasource.mysql")
	@Bean
	public DataSourceProperties  mysqldatasourceproperties() {
		 return new DataSourceProperties();
	}
	
	
	@Bean
	public DataSource mysqlDataSource() {
     DriverManagerDataSource datasource =  new DriverManagerDataSource();
     datasource.setUsername(mysqldatasourceproperties().getUsername());
     datasource.setPassword(mysqldatasourceproperties().getPassword());
     datasource.setUrl(mysqldatasourceproperties().getUrl());
     datasource.setDriverClassName(mysqldatasourceproperties().getDriverClassName());
     
     return datasource;
	}
	
	
	
	
}
