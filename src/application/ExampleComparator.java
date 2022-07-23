package application;

import entities.Product4;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ExampleComparator {

    public static void main(String[] args) {

        List<Product4> list = new ArrayList<>();
        list.add(new Product4("TV", 900.00));
        list.add(new Product4("Notebook", 1200.00));
        list.add(new Product4("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product4 p : list){
            System.out.println(p);
        }
    }
}
