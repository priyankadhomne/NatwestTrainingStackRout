package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {
    public static void main(String[] args) {
        try {
            // Step-1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class found");

            // step-2 establish the connection
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root1234");
            System.out.println("Connected successfully");

            // step-3 Create the statement
            Statement statement = com.createStatement();   // data retrieve and send
//            statement.execute("insert into employee values(8,'Radha','HR',100000,23)");
//            System.out.println("Inserted successfully");

            ResultSet rs = statement.executeQuery("select * from employee");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            com.close();
        }
        catch (Exception e) {
            e.printStackTrace();       // It will print whole error
            System.out.println(e.getMessage());
        }
    }
}
