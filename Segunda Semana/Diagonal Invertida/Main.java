/*
Autor: Andres Anguiano
Fecha: 23/08/2023
Hacer una diagonal invertida con asteriscos de tamaño n
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    imprimeDiagonalInv(n);
    sc.close();
  }

  static void imprimeDiagonalInv(int x) {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++)
        if (j == (x - 1) - i)
          System.out.print("*");
        else
          System.out.print(" ");
      System.out.println();
    }
  }
}