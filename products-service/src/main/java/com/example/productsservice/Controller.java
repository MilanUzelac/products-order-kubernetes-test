package com.example.productsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProductRepository productRepository;

    public Controller(ProductRepository personRepository) {
        this.productRepository = personRepository;
    }

    @GetMapping
    public String test(){
        return "Raddiii";
    }

    @GetMapping("/saveMongo")
    public String saveMongo(){
        productRepository.saveAll(Arrays.asList(new Product(1,"Samsung S3",200),new Product(2,"Iphone 10",700)));
        return "Products have been successfully saved!";
    }


    @RequestMapping(method = RequestMethod.GET,value = "/getProducts",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

}