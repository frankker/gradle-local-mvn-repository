package com.example.springgradle.controller;

import com.example.springgradle.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  private TestService testService;

  public MainController(TestService testService) {
    this.testService = testService;
  }

  @GetMapping("/test")
  public ResponseEntity<String> testEndpoint() {
    return ResponseEntity.ok(testService.getName());
  }
}
