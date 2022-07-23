package application;

import entities.Product4;
import entities.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FunctionsAsArgument {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product4> list = new ArrayList<>();

        list.add(new Product4("Tv", 900.00));
        list.add(new Product4("Mouse", 50.00));
        list.add(new Product4("Tablet", 350.50));
        list.add(new Product4("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f",sum));
    }
}
