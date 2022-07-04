package application;

import entities.Func;

import java.util.Locale;
import java.util.Scanner;

public class exFunc {

    public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     Func f = new Func();

        System.out.println("Name: ");
        f.name = sc.nextLine();
        System.out.println("Gross salary: ");
        f.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        f.tax = sc.nextDouble();

        System.out.println(f);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        System.out.println("Updated data: " + f.name + ", $" + f.increasedSalary(percentage));



    }
}
