package com.natwest.exceptionhandling;

class IdNotFoundException extends RuntimeException{

}
public class ExceptionType {
    public static void main(String[] args) {
        throw new IdNotFoundException();
    }
}
