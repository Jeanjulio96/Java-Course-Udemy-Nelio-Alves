package util;

import entities.Product4;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product4> {

    @Override
    public void accept(Product4 p) {

        p.setPrice(p.getPrice() * 1.1);
    }
}
