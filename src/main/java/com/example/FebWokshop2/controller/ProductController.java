package com.example.FebWokshop2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RestControllerAdvice // We use it to trigger the error/exception occuring in our code
public class ProductController {

    List<String> products = new ArrayList<>();
    @GetMapping("/hello")
    @ResponseBody
    public  String hello(){
        return  "Hello, World!";
    }

    @PostMapping("/products")
    public String createProduct(@RequestBody String product){
        products.add(product);
        return "Product Created!";
    }

    @GetMapping("/products")
    public List<String> getProducts(){
        return products;
    }

    @PutMapping("/products/{id}")
    public  String updateProduct(@PathVariable int id, @RequestBody String product){
        if(id >= 0 && id < products.size()){
            products.set(id, product);
            return "Product updated!";
        } else {
            return  "Product not found!";
        }
    }

    @DeleteMapping("/products/query") // ?id=0
    public String deleteProduct(@RequestParam int id){
        if(id >= 0 && id < products.size()){
            products.remove(id);
            return  "Product deleted!";
        } else {
            return  "Product not found!";
        }
    }

    @ExceptionHandler(Exception.class) //to catch the triggered error/exception
    public  String handleException(Exception e){
        return "An error occured: " + e.getMessage();
    }
}
