package com.example.mongodbvshibernate.dbconfiguration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfiguration {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://remotemysql.com/Xoaizfgh2D");
        dataSourceBuilder.username("Xoaizfgh2D");
        dataSourceBuilder.password("DNmhNeNLXn");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");

//                dataSourceBuilder.url("jdbc:mysql://localhost/jpaForBeginners");
//        dataSourceBuilder.username("myuser");
//        dataSourceBuilder.password("secret");
//        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");


        return dataSourceBuilder.build();


    }

    @Bean
    JdbcTemplate getJdbcTempleate() {
        return new JdbcTemplate(getDataSource());

    }


}
