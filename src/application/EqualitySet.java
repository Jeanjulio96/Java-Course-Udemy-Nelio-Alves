package application;


import entities.Product2;

import java.util.HashSet;
import java.util.Set;

public class EqualitySet {

    public static void main(String[] args) {

        Set<Product2> set = new HashSet<>();
        set.add(new Product2("TV", 900.0));
        set.add(new Product2("Notebook", 1200.0));
        set.add(new Product2("Tablet", 400.0));
        Product2 prod = new Product2("Notebook", 1200.0);
        System.out.println(set.contains(prod));
    }
}

