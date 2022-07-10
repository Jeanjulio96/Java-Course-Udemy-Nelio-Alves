package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductC{

    private Date manufactureDate;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(){

    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() throws ParseException {

        return super.getName()
                + " (used)"
                + " $"
                + String.format("%.2f",super.getPrice())
                + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
