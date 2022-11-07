package com.example.clase12clientews.controller;

import com.example.clase12clientews.dao.ProductRestFeign;
import com.example.clase12clientews.dao.ProductoDao;
import com.example.clase12clientews.entity.Item;
import com.example.clase12clientews.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ProductController {

    @Autowired
    ProductoDao productoDao;

    @Autowired
    ProductRestFeign productRestFeign;

    @GetMapping("")
    public List<Item> listarItems() {
        List<Product> listaProductos = productoDao.listar();
        List<Item> listaItems = new ArrayList<>();

        for (Product product : listaProductos) {
            Item item = new Item();
            item.setProduct(product);
            item.setCantidad(Math.round(Math.random() * 10));
            listaItems.add(item);
        }
        return listaItems;
    }

    @GetMapping("/f")
    public List<Item> listarItemsConFeign() {
        List<Product> listaProductos = productRestFeign.listarProductos();
        List<Item> listaItems = new ArrayList<>();

        for (Product product : listaProductos) {
            Item item = new Item();
            item.setProduct(product);
            item.setCantidad(Math.round(Math.random() * 10));
            listaItems.add(item);
        }
        return listaItems;
    }
}
