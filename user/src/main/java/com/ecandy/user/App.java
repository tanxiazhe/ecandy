package com.ecandy.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication//(exclude= {DataSourceAutoConfiguration.class})
@MapperScan({"com.ecandy.user.mapper"})
@EnableDiscoveryClient
public class App {


    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
}
