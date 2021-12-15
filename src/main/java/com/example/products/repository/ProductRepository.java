package com.example.products.repository;

import com.example.products.domain.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> listarProductos();
    Product findProduct(String id);
    void createProduct(Product person);
    void updateProduct(String id, Product product);
    Product deleteProduct(String id);
}
