package com.example.products.domain;

public class Product {
    private String product;
    private String id;
    private String price;
    private String weight;

    public Product(String product, String id, String price, String weight) {
        this.product = product;
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
