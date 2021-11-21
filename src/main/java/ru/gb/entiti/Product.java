package ru.gb.entiti;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Product {
    private String id;
    private  int titile;
    private List<Product> cost;

}
