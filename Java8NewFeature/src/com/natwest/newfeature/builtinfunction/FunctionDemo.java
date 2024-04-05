package com.natwest.newfeature.builtinfunction;


import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f1 = (name)->name.length();
        System.out.println(f1.apply("Sachin"));

        Function<Integer,Integer> findCube = (num)->num*num*num;
        System.out.println(findCube.apply(3));

        Function<Integer,String> f2 = (n)-> {
            if (n>18)
                    return "You are eligible";
            return "You are not eligible";
        };
        System.out.println(f2.apply(23));

        Function<Integer, String> f3= n -> n > 18 ? "You are eligible" : "You are not eligible";
        System.out.println(f3.apply(23));

    }
}
