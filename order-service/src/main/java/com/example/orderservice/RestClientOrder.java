package com.example.orderservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="products-service")
public interface RestClientOrder {
    @RequestMapping("/saveMongo")
    String saveMongo();

    @RequestMapping("/getProducts")
    List<Product> getProducts();
}
