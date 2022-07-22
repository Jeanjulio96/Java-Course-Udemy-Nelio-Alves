package application;

import entities.Product4;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap2 {

    public static void main(String[] args) {

        Map<Product4, Double> stock = new HashMap<>();
        Product4 p1 = new Product4("Tv", 900.0);
        Product4 p2 = new Product4("Notebook", 1200.0);
        Product4 p3 = new Product4("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product4 ps = new Product4("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
