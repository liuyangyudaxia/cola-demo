package com.example.colademo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.colademo", "com.alibaba.cola" })
@MapperScan("com.example.colademo.gatewayimpl.database")
public class ColaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColaDemoApplication.class, args);
    }

}
