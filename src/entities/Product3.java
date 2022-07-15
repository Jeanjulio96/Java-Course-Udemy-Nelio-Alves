package entities;

import java.io.Serializable;

public class Product3 implements Serializable {

    public String name;
    public double price;
    public int quantity;

    public Product3(){

    }

    public Product3(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public double total() {
        return price * quantity;
    }
}
