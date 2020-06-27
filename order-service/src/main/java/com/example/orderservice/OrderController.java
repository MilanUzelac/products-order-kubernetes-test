package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    RestClientOrder restClientOrder;

    @Autowired
    public OrderController(RestClientOrder restClientOrder) {
        this.restClientOrder = restClientOrder;
    }

    @GetMapping
    public String test(){
        return "Raddiii ORDERR";
    }

    @GetMapping("/saveProductFromOrder")
    public String saveProductFromOrder(){
        return  restClientOrder.saveMongo();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/getProductsFromOrder",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductFromOrder(){
        return restClientOrder.getProducts();
    }

}
