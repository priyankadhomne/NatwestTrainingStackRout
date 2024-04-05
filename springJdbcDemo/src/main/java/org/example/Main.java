package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        EmployeeCrud employeeCrud = (EmployeeCrud) context.getBean("getEmployeeInstance");
        //employeeCrud.createTable();
        //employeeCrud.insertData();
        //employeeCrud.insertMultipleData();
        //int status = employeeCrud.updateData(new Employee(1,"Saurabh","CI"));
        //System.out.println(status);

        int status = employeeCrud.deleteData(1);
        System.out.println(status);
    }
}