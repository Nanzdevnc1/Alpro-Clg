package Modul7.Percobaan;

import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        int n, x;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        n = input.nextInt();
        System.out.print("Masukkan nilai x : ");
        x = input.nextInt();

        sigma(n, x);
    }

    public static void sigma(int nilaiN, double nilaiX) {
        double y = 0;

        for (int i = 1; i <= nilaiN; i++) {
            y += nilaiX + (2 * i);
        }
        System.out.println(y);
    }
}
