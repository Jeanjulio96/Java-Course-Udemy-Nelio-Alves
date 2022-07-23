package application;

import entities.Employee4;
import entities.Product4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exStream {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String path = sc.nextLine();


            try(BufferedReader br = new BufferedReader(new FileReader(path))) {
                List<Employee4> list = new ArrayList<>();

                String line = br.readLine();
                while (line != null) {
                    String[] fields = line.split(",");
                    list.add(new Employee4(fields[0], fields[1], Double.parseDouble(fields[2])));
                    line = br.readLine();
                }
                System.out.println("Enter salary:");
                double salary = sc.nextDouble();

                List<String> emails = list.stream()
                        .filter(p -> p.getSalary() > salary)
                        .map(p -> p.getEmail())
                        .sorted()
                        .collect(Collectors.toList());

                System.out.println("Email of people whose salary is more than " + salary);
                emails.forEach(System.out::println);

                double sum = list.stream()
                        .filter(x -> x.getName().charAt(0) == 'M')
                        .map(x -> x.getSalary())
                        .reduce(0.0, (x, y) -> x + y);

                System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

            }

            catch(IOException e ){
                System.out.println("Error: " + e.getMessage());
            }

            sc.close();
        }
    }

