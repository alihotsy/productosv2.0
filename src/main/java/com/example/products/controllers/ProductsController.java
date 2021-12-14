package com.example.products.controllers;

import com.example.products.domain.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {
  @GetMapping
    public String getProducts(){
      return "Rice";
  }
  @PostMapping
  public Product createProducts(
          @RequestBody Product product
  ){
     return product;
  }
  @GetMapping(value = "/{id}")
  public Product getProductById(
          @PathVariable("id") String productId
  ){
        return new Product("Milk",productId);
  }

  @PutMapping(value = "/{id}")
  public Product updateProduct(
          @PathVariable("id") String productId,
          @RequestBody Product product

  ){
    return product;
  }

  @DeleteMapping(value = "/{id}")
  public Product deleteProduct(
      @PathVariable("id") String productId
  ){
   return new Product("Algo",productId);
  }
}
