package com.ecandy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@MapperScan({"com.ecandy.order.mapper"})
//@EnableOAuth2Sso
@EnableOAuth2Client
//@EnableResourceServer
public class App {


    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
}
