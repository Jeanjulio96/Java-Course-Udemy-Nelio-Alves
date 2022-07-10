package entities;

public class ImportedProduct extends ProductC{

    private Double customFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return super.getPrice() + customFee;
}

    @Override
    public String priceTag(){

        return super.getName()
                + " $"
                + String.format("%.2f",totalPrice())
                + " (Customs fee: $ " + String.format("%.2f",customFee) + ")";
    }
}
