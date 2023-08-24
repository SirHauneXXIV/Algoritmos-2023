/*
Autor: Andres Anguiano
Fecha: 23/08/2023
Hacer una diagonal con asteriscos de tamaño n
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    imprimeDiagonal(n);
    sc.close();
  }

  static void imprimeDiagonal(int x) {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++)
        if (i == j)
          System.out.print("*");
        else
          System.out.print(" ");
      System.out.println();
    }
  }
}