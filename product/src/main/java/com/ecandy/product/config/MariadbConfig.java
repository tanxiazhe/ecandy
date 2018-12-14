package com.ecandy.product.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@PropertySource(value = { "classpath:mariadb.properties" })
@Configuration
@MapperScan(basePackages = "com.ecandy.product.mapper", sqlSessionFactoryRef = "mariadbSqlSessionFactory")
public class MariadbConfig {

    @Primary
    @Bean(name = "mariadbDataSource")
    @ConfigurationProperties("mariadb.datasource")
    public DataSource mariadbDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "mariadbSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("mariadbDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapping/*.xml"));
        return sessionFactoryBean.getObject();
    }

}
