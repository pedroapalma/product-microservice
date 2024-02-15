package com.pedro.productmicroservice.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RequiredArgsConstructor
@RestController
@RequestMapping("api/categories")
public class CategoryController {

  @Value("${app.test-prod}")
  private final String testProd;
}
