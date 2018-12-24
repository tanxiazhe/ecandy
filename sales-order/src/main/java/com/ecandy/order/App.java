package com.ecandy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
//@SpringCloudApplication
@MapperScan({"com.ecandy.order.mapper"})
//@EnableOAuth2Sso
@EnableOAuth2Client
//@EnableResourceServer
@EnableDiscoveryClient

public class App {


    public static void main(String[] args) {

        new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
