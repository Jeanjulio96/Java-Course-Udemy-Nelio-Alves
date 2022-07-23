package application;

import entities.Product4;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ExampleConsumer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product4> list = new ArrayList<>();

        list.add(new Product4("Tv", 900.00));
        list.add(new Product4("Mouse", 50.00));
        list.add(new Product4("Tablet", 350.50));
        list.add(new Product4("HD Case", 80.90));

        double factor = 1.1;


        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);

    }
}
