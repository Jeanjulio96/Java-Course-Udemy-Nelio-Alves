package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class ex1Rectangle {

    public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     Rectangle rec = new Rectangle();

     System.out.println("Enter rectangle width and height: ");
     rec.width = sc.nextDouble();
     rec.height = sc.nextDouble();

        System.out.println("AREA = " + rec.area());
        System.out.println("PERIMETER = " + rec.perimeter());
        System.out.println("DIAGONAL = " + rec.diagonal());


    }
}
