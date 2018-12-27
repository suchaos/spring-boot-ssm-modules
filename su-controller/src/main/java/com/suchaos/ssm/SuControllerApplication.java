package com.suchaos.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suchaos.ssm.mapper")
public class SuControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuControllerApplication.class, args);
    }

}

