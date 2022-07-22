package application;

import java.util.*;

public class exSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int cont = 0;

        System.out.println("How many students for course A?");
        int n = sc.nextInt();

         int [] vect = new int[n];

         for (int i=0; i<n; i++){
                 vect[i] = sc.nextInt();
             if (set.add(vect[i])){
                 cont++;
             }

         }

        System.out.println("How many students for course B?");
        n = sc.nextInt();


            for (int i=0; i<n; i++){
                vect[i] = sc.nextInt();
                if (set.add(vect[i])){
                    cont++;
                }

            }

        System.out.println("How many students for course C?");
        n = sc.nextInt();

        for (int i=0; i<n; i++){

            vect[i] = sc.nextInt();
            if (set.add(vect[i])){
                cont++;
            }

        }

        System.out.println("Total students: " + cont);

        sc.close();
    }
}

