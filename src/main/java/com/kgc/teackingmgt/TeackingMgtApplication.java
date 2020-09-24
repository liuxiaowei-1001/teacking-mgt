package com.kgc.teackingmgt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kgc.teackingmgt.dao")
public class TeackingMgtApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeackingMgtApplication.class, args);
    }

}
