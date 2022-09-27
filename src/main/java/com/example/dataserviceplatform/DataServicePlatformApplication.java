package com.example.dataserviceplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories
@SpringBootApplication(scanBasePackages={"com.example.dataserviceplatform.Controller",
        "com.example.dataserviceplatform.Service"})
public class DataServicePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataServicePlatformApplication.class, args);
    }

}
