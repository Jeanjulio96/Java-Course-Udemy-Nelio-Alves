package application;

import entities.productVectors;

import java.util.Locale;
import java.util.Scanner;

public class vectors2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        productVectors[] vect = new productVectors[n];


        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new productVectors(name,price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f",avg);
    }
}
