package application;

import entities.Product4;

import java.util.Comparator;

public class MyComparator implements Comparator<Product4> {


    @java.lang.Override
    public int compare(Product4 p1, Product4 p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
