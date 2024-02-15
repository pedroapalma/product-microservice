package com.pedro.productmicroservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RefreshScope
@RestController
@RequestMapping("api/categories")
public class CategoryController {

  @Value("${app.test-prod:test}")
  private String testProd;

  @GetMapping("test-prod")
  public String getTesProd() {
    return this.testProd;
  }
}
