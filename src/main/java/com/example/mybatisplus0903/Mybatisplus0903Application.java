package com.example.mybatisplus0903;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisplus0903.mapper")
public class Mybatisplus0903Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisplus0903Application.class, args);
    }

}
