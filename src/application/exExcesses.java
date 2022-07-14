package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class exExcesses {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

             try {
                 System.out.println("Enter account data: ");
                 System.out.println("Number: ");
                 int number = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Holder: ");
                 String holder = sc.nextLine();
                 System.out.println("Initial balance:| ");
                 double initialBalance = sc.nextDouble();
                 System.out.println("Withdraw limit: ");
                 double withdrawLimit = sc.nextDouble();

                 Account acc = new Account(number, holder, initialBalance, withdrawLimit);

                 System.out.println("Enter amount for withdraw: ");
                 double amount = sc.nextDouble();
                 acc.withdraw(amount);

                 System.out.println(acc);
             }
             catch(DomainException e){
                 System.out.println("Withdraw error: " + e.getMessage());
        }
             catch (RuntimeException e){
                 System.out.println("Unexpected error");
             }

        sc.close();
    }
}
