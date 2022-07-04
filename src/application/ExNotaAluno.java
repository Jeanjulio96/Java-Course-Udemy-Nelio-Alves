package application;

import entities.AlunoNotas;

import java.util.Locale;
import java.util.Scanner;

public class ExNotaAluno {

    public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      AlunoNotas an = new AlunoNotas();

      an.name = sc.nextLine();
      an.nota1 = sc.nextDouble();
      an.nota2 = sc.nextDouble();
      an.nota3 = sc.nextDouble();

      if (an.finalGrade() > 60){

          System.out.println("FINAL GRADE: " + an.finalGrade());
          System.out.println("PASS");

      }
      if (an.finalGrade() < 60) {
          System.out.println("FINAL GRADE: " + an.finalGrade());
          System.out.println("FAILED");
          System.out.printf("MISSING POINTS: %.2f", 60 - an.finalGrade());
      }


    }
}
