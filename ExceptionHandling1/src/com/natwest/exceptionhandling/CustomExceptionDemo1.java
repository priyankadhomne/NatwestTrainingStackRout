package com.natwest.exceptionhandling;

class AgeException extends Exception {
    String msg;

    public AgeException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

class Vote {
    public void checkEligibility(int age) throws AgeException {
        if (age>=18) {
            System.out.println("You are eligible to vote");
        }
        else {
            throw new AgeException("Invalid age , minimum age is 18");
        }
    }
}

public class CustomExceptionDemo1 {
    public static void main(String[] args) {
        Vote vote = new Vote();
        try {
            vote.checkEligibility(3);
        } catch (AgeException e) {
            System.out.println(e.getMsg());
        }
    }
}
