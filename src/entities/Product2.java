package entities;

import java.util.Objects;

public class Product2 {

    private String name;
    private double price;
    private int quantity;

    public Product2(){

    }

    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product2 product2 = (Product2) o;
        return Double.compare(product2.price, price) == 0 && quantity == product2.quantity && Objects.equals(name, product2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}