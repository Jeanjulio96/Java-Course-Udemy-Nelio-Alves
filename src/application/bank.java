package application;

import entities.bank2;

import java.util.Locale;
import java.util.Scanner;

public class bank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        bank2 b;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter initial deposit value:" );
            double initialDeposit = sc.nextDouble();
            b = new bank2(number, holder, initialDeposit);
        }
        else {
            b = new bank2(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(b);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        b.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(b);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        b.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(b);


        sc.close();
        }
    }





