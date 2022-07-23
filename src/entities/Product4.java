package entities;

public class Product4{

    private String name;
    private Double price;

    public Product4(String name, Double price) {
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

    public static  boolean staticProductPredicate(Product4 p){
        return p.getPrice() >= 100.00;
    }

    public boolean nonStaticProductPredicate(){
        return price >= 100.00;
    }

    public static void staticPriceUpdate(Product4 p){
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate(){
        price = price * 1.1;
    }

    public static String staticUpperCaseName(Product4 p){
        return p.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName(){
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }


}