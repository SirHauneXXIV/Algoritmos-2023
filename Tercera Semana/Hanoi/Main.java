/**
 * @author JAIME ALBERTO QUIÑONES
 * Fecha: agosto, 2023
 * Objetivo: Resolver torres de hanoi
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Hanoi(n, 'A', 'C', 'B');
    }

    public static void Hanoi(int n, char A, char C, char B) {
        if (n > 0) {
            Hanoi(n - 1, A, B, C);
            System.out.println("Mover disco " + n + " de " + A + " al " + C);
            Hanoi(n - 1, B, C, A);
        }
    }
}
