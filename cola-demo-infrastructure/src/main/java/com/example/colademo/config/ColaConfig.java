package com.example.colademo.config;

import com.alibaba.cola.boot.SpringBootstrap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration for COLA framework
 */
@Configuration
@ComponentScan(value = {"com.alibaba.cola","ColaDemoApplication"})
public class ColaConfig {

    @Bean(initMethod = "init")
    public SpringBootstrap bootstrap() {
        SpringBootstrap bootstrap = new SpringBootstrap();
        return bootstrap;
    }

}