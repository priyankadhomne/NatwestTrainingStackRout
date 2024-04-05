package com.natwest.stringtask;

import java.util.Scanner;

public class FruitJuice {
    private int productCode;
    private String flavour;
    private String packType;
    private int packSize;
    private float productPrice;

    public FruitJuice() {
    }

    public FruitJuice(int productCode, String flavour, String packType, int packSize, float productPrice) {
        this.productCode = productCode;
        this.flavour = flavour;
        this.packType = packType;
        this.packSize = packSize;
        this.productPrice = productPrice;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code");
        this.productCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the flavour of code");
        this.flavour = sc.nextLine();
        System.out.println("Enter the pack type of product");
        this.packType = sc.nextLine();
        System.out.println("Enter the package size of product");
        this.packSize = sc.nextInt();
        System.out.println("Enter the product price");
        this.productPrice = sc.nextFloat();
    }

    public void setPackSize(float productPrice) {
        this.productPrice = productPrice;
    }

    public void discount() {
        setPackSize((productPrice -= (productPrice*0.1)));
        System.out.println("Total price of a product using discount " + (productPrice -= (productPrice*0.1)));
    }

    public void display() {
        System.out.println( "FruitJuice{" +
                "productCode=" + productCode +
                ", flavour='" + flavour + '\'' +
                ", packType='" + packType + '\'' +
                ", packSize=" + packSize +
                ", productPrice=" + productPrice +
                '}');
    }

}
