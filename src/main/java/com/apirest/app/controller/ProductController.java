package com.apirest.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.app.entities.Department;
import com.apirest.app.entities.Products;

@RestController
@RequestMapping(value = "/products")

public class ProductController {
    
    @GetMapping
    public List<Products> getObjects(){
        
        Department d1 = new Department(1l , "Tech");
        Department d2 = new Department(2l, "Pet");
        
        Products p1 = new Products(1L,"Mouse Pro ", 560.0, d1);
        Products p2 = new Products(2L,"Headset", 200.0, d1);
        Products p3 = new Products(3L,"Pet House", 300.0, d2);
        Products p4 = new Products(4l, "Pet Lion", 150.0, d2);

        List<Products> list = Arrays.asList(p1,p2,p3,p4);
        return list;      
    }
}
