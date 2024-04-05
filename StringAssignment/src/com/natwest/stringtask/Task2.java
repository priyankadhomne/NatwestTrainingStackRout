package com.natwest.stringtask;

class Pattern{
    void polygon(int n, char ch) {
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

class Design extends Pattern{
    void polygon(int x, int y) {
        for(int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Design design = new Design();
        design.polygon(2,'O');
        design.polygon(2,5);

    }
}
