package entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product4> list, Predicate<Product4> criteria){
        double sum = 0.0;
        for (Product4 p : list) {
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
