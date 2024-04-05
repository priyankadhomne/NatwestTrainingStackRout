package com.natwest.streamproject;

public class Wrestler {
    private int id;
    private String name;
    private double weight;
    private double height;
    private int age;

    public Wrestler(int id, String name, double weight, double height, int age) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
