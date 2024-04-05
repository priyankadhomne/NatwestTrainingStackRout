package com.natwest.newfeature.methodReference;

@FunctionalInterface
interface ProductDetails {
    Product getProduct(String name);
}
class Product {
    private String name;
    public Product(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class ReferenceToConstructor {
    public static void main(String[] args) {
        ProductDetails productDetails = Product::new;
        Product p = productDetails.getProduct("SmartPhone");  // To set the property
        System.out.println(p.getName());  // Return the method
    }
}
