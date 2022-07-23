package application;

import entities.Product4;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleFunction {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product4> list = new ArrayList<>();

        list.add(new Product4("Tv", 900.00));
        list.add(new Product4("Mouse", 50.00));
        list.add(new Product4("Tablet", 350.50));
        list.add(new Product4("HD Case", 80.90));

        List <String> names =  list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());  // aplica funcao a cada elemento da lista

        names.forEach(System.out::println);



    }
}
