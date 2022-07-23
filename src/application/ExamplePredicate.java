package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product4;

public class ExamplePredicate {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        List<Product4> list = new ArrayList<>();

        list.add(new Product4("Tv", 900.00));
        list.add(new Product4("Mouse", 50.00));
        list.add(new Product4("Tablet", 350.50));
        list.add(new Product4("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);

        for (Product4 p : list) {
            System.out.println(p);
        }
    }
}