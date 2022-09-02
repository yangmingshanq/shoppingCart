package com.thoughtworks.codepairing.model;

public class Product {
    private final double price;
    private final String productCode;
    private final String name;

    public Product(double price, String productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return productCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Product)) {
            return false;
        }
        return this.productCode.equals(((Product) obj).productCode);
    }
}
