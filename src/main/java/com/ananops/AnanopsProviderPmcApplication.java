package com.ananops;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ananops.provider.mapper")
public class AnanopsProviderPmcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnanopsProviderPmcApplication.class, args);
    }

}
