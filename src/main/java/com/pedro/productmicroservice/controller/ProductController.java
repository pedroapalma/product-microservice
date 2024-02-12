package com.pedro.productmicroservice.controller;

import com.pedro.productmicroservice.entity.ProductEntity;
import com.pedro.productmicroservice.repository.ProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

  private final ProductRepository productRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ProductEntity> getAllProducts() {
    return this.productRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void createProduct(@RequestBody ProductEntity productEntity) {
    this.productRepository.insert(productEntity);
  }
}
