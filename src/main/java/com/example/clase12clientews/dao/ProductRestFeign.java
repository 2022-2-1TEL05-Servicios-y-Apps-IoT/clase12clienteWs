package com.example.clase12clientews.dao;

import com.example.clase12clientews.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "servicio-productos")
public interface ProductRestFeign {

    @GetMapping("/product")
    List<Product> listarProductos();

    @GetMapping("/product/{id}")
    Product buscarPorId(@PathVariable("id") int id);

}
