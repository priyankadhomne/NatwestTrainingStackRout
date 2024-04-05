package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public DbConnection getInstanceOfDbConnection() {
        DbConnection dbConnection = new DbConnection();
        dbConnection.setUsername("User1");
        dbConnection.setPassword("pass1");
        return dbConnection;
    }

    @Bean
    public DbConnection getInstance2() {
        return new DbConnection("User2","Pass2");
    }

    @Bean
    public DbConnection getInstance3() {
        return getInstance2();
    }
}
