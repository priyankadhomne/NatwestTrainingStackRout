package com.natwest.exceptionhandling;

class InvalidNamingException extends Exception {
    InvalidNamingException(String msg) {
        super(msg);
    }
}


class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void validate () throws InvalidNamingException {
        if  (firstName == null || lastName == null) {
            throw new NullPointerException("null");
        }
        else if (firstName.length()<3 || lastName.length()<3) {
            throw new InvalidNamingException("Enter proper name");
        }
        else {
            System.out.println("Your name successfully store");
        }
    }
}


public class Task2 {
    public static void main(String[] args) throws InvalidNamingException {
        Employee employee = new Employee("Ram","Sita");
        try {
            employee.validate();
        }
        catch (InvalidNamingException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
