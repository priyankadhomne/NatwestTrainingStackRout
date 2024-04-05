package org.example;

import org.example.examples.ConnectionDb;
import org.example.examples.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("objects.xml");
        Employee employee = (Employee) context.getBean("emp");
        employee.setName("Ramesh");
        System.out.println(employee.getName());

        Restaurant restaurant = (Restaurant) context.getBean("res1");
        System.out.println(restaurant.getName());
        System.out.println(restaurant.getAddress());

//        Restaurant restaurant1 = (Restaurant) context.getBean("res4");
//        System.out.println(restaurant1.getName());
//        System.out.println(restaurant1.getAddress());

        ConnectionDb connectionDb = (ConnectionDb) context.getBean("oracle bean");
        System.out.println(connectionDb.getUsername());
        System.out.println(connectionDb.getPassword());
        System.out.println(connectionDb.getDbname());
        System.out.println(connectionDb.displayConnectionDetails());

    }
}