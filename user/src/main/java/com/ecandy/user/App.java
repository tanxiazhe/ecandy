package com.ecandy.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude= {DataSourceAutoConfiguration.class})
@MapperScan({"com.ecandy.user.mapper"})
public class App {


    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
}
