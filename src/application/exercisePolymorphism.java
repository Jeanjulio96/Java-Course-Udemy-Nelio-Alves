package application;

import entities.ImportedProduct;
import entities.ProductC;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class exercisePolymorphism {

    public static void main(String[] args) throws ParseException {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<ProductC> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){

            System.out.println("Product #" + i + " data: ");
            System.out.println("Common, used or imported (c/u/i)?");
            char op = sc.next().charAt(0);
            sc.nextLine();

            if (op == 'c'){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                ProductC prod = new ProductC (name, price);
                list.add(prod);
            }
            if (op == 'i'){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Custom fee: ");
                double customFee = sc.nextDouble();
                ProductC prod = new ImportedProduct(name, price, customFee);
                list.add(prod);
            }
            if (op == 'u'){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                ProductC prod = new UsedProduct(name, price, date);
                list.add(prod);
            }

            }
        for (ProductC prod : list){
            System.out.println(prod.priceTag());
        }

    sc.close();
    }
}
