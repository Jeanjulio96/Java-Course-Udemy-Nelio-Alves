package util;

import entities.Product4;

import java.util.function.Function;

public class UpperCaseName implements Function<Product4, String> {


    @Override
    public String apply(Product4 p) {

        return p.getName().toUpperCase();
    }
}
