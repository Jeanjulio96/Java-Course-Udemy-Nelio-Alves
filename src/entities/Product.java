package entities;

import java.io.Serializable;

public class Product implements Comparable<Product>{


    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;

    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){

        return name
                + ", $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f",totalValueInStock());

    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
