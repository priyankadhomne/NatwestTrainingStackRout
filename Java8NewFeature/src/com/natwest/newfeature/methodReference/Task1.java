package com.natwest.newfeature.methodReference;


@FunctionalInterface
interface Utility {
    int cube(int num);
}

class Info {
    int findCube(int num) {
        return num*num*num;
    }
    static int findCube2(int num) {
        return num*num*num;
    }
}

public class Task1 {
    public static void main(String[] args) {
        // using lambda
        Utility utility = (num)-> {return num*num*num;
        };
        System.out.println(utility.cube(2));


        // using static method
        Utility utility1 = Info::findCube2;
        System.out.println(utility1.cube(2));


        // using non static
        Info info = new Info();
        Utility utility2 = info::findCube;
        System.out.println(utility2.cube(3));

    }
}
