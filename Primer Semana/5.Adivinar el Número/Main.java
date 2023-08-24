/*
Fecha: 16/08/2023
Autor: Andres Anguiano
Indicaciones: Adivinar el núm. ayudando al usuario
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean isSecret = true;
    int mySecretNumber = 8;
    System.out.println("Guess my secret number");
    while (isSecret) {
      int usrGuess = sc.nextInt();
      if (usrGuess < mySecretNumber)
        System.out.println("mine is greater ");
      else if (usrGuess > mySecretNumber)
        System.out.println("mine is smaller ");
      else {
        System.out.println("You guessed right");
        isSecret = false;
      }
    }
    sc.close();
  }
}
