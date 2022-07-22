package application;

import entities.Client2;

public class HashCodeAndEquals {

    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client2 c1 = new Client2("Maria", "maria@gmail.com");
        Client2 c2 = new Client2 ("Maria","alex@gmail.com");

        String s1 = "Test";
        String s2 = "Test";
                System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
    }
}
