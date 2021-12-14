package com.example.products.domain;

public class Product {
    private String product;
    private String id;

    public Product(String product, String id) {
        this.product = product;
        this.id = id;
    }

    public Product() {
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "product='" + product + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
