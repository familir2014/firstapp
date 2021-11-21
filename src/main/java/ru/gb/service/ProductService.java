package ru.gb.service;

import ru.gb.entiti.Product;


import java.util.Arrays;
import java.util.List;

public class ProductService {
    public Product createNewProduct(){
        List<Product> products = Arrays.asList(
                new Product("Yabloko", 1, null),
                new Product("Morkov", 2, null),
                new Product("Riba", 3, null),
                new Product("Miaso", 4, null),
                new Product("Omar", 5, null),
                new Product("Cartoha", 6, null),
                new Product("Pomidor", 7, null),
                new Product("Brockoli", 8, null),
                new Product("Maslo", 9, null),
                new Product("Kolbasa", 10, null)

        );
        return new Product("Vitrina", 11, products);

    }

}

