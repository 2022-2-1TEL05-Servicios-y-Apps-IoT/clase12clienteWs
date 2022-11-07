package com.example.clase12clientews.dao;

import com.example.clase12clientews.dao.helper.AppConfig;
import com.example.clase12clientews.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductoDao {

    @Autowired
    RestTemplate getRestTemplateInstance;

    public List<Product> listar(){
        RestTemplate restTemplate = getRestTemplateInstance;
        Product[] productArray = restTemplate.getForObject("http://servicio-productos/product", Product[].class);
        return Arrays.asList(productArray);
    }

    public Product buscarPorId(int id){
        RestTemplate restTemplate = getRestTemplateInstance;
        String url = "http://servicio-productos/product/" + id;
        Product product = restTemplate.getForObject(url, Product.class);
        return product;
    }


}
