package com.ecandy.apigateway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

    }

}
