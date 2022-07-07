package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private ProductEnum product;

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price, ProductEnum product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductEnum getProduct() {
        return product;
    }

    public void setProduct(ProductEnum product) {
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }

    @Override
        public String toString(){
         return getProduct().getName()
                 + ", $"
                 + String.format("%.2f", price)
                 + ", quantity"
                 + ", Subtotal: $"
                 + String.format("%.2f", subTotal());


    }
}

