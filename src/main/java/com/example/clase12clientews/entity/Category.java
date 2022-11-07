package com.example.clase12clientews.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Integer id;
    private String categoryName;
    private String description;
    private byte[] picture;

}