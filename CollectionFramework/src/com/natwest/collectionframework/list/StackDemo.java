package com.natwest.collectionframework.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Rani");
        stack.push("Sachin");
        stack.push("Disha");
        stack.add("Vijay");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
