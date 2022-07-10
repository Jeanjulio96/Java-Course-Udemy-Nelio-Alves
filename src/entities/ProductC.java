package entities;

import java.text.ParseException;

public class ProductC {

    private String name;
    private Double price;

    public ProductC(){

    }

    public ProductC(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String priceTag() throws ParseException {

        return name + " $" + String.format("%.2f",price);
    }

}
