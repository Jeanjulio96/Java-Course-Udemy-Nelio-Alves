package util;

import entities.Product4;
import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product4>{


    @Override
    public boolean test(Product4 p) {
        return p.getPrice() >= 100.0;
    }
}
