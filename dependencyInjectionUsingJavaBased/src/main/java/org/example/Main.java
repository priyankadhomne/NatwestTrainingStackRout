package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DbConnection dbConnection = (DbConnection) context.getBean("getInstanceOfDbConnection");
        System.out.println(dbConnection.getUsername());
        System.out.println(dbConnection.getPassword());

        DbConnection dbConnection1 = (DbConnection) context.getBean("getInstance3");
        dbConnection1.setPassword("Pass");
        dbConnection1.setUsername("Sam");
        System.out.println(dbConnection1.getUsername());
        System.out.println(dbConnection1.getPassword());

    }
}