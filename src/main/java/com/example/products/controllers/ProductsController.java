package com.example.products.controllers;

import com.example.products.domain.Product;
import com.example.products.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {
  ProductRepository repository;

  public ProductsController(ProductRepository repository) {
    this.repository = repository;
  }

  @GetMapping
    public List<Product> getProducts(){
      return  repository.listarProductos();
  }
  @PostMapping
  public Product createProducts(
          @RequestBody Product product
  ){
    repository.createProduct(product);
     return product;
  }
  @GetMapping(value = "/{id}")
  public Product getProductById(
          @PathVariable("id") String productId
  ){
       return repository.findProduct(productId);

  }

  @PutMapping(value = "/{id}")
  public Product updateProduct(
          @PathVariable("id") String productId,
          @RequestBody Product product

  ){
    repository.updateProduct(productId,product);
    return product;
  }

  @DeleteMapping(value = "/{id}")
  public Product deleteProduct(
      @PathVariable("id") String productId
  ){
      return repository.deleteProduct(productId);

  }
}
