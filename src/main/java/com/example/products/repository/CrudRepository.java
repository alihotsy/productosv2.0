package com.example.products.repository;

import com.example.products.domain.Product;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class CrudRepository implements ProductRepository {
    private final Map<String,Product> persist = new HashMap<>();
    @Override
    public List<Product> listarProductos() {
        Collection<Product> productos = persist.values();
        return new ArrayList<>(productos);
    }

    @Override
    public Product findProduct(String id) {
        return persist.get(id);
    }

    @Override
    public void createProduct(Product product) {
        persist.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {
        if(persist.containsKey(product.getId()) || !persist.containsKey(id)){
            throw new IllegalArgumentException(
                    "El id que intenta actualizar ya existe en otros productos, o el producto no existe con ese id"
            );
        }
        persist.remove(id);
        persist.put(product.getId(),product);
    }

    @Override
    public Product deleteProduct(String id) {
        Product deleted = persist.get(id);
        persist.remove(id);
        return deleted;
    }
}
