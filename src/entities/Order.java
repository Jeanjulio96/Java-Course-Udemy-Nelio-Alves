package entities;

import java.util.Date;

public class Order {

    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
