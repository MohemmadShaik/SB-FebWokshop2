package com.example.FebWokshop2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2") //version 2
public class ProductController2 {

    @PostMapping("/products")
    public String createProduct(@RequestBody List<String> product){
        return "Product Created!";
    }
}
