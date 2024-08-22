package Modul4.Percobaan;

import java.util.Scanner;

public class Nomor4A {
    public static void main(String[] args) {
        int angka, n, jumlahAngkaGenap, jumlahAngkaGanjil;
        String angkaGenap, angkaGanjil;
        Scanner input = new Scanner (System.in);

        angkaGenap = "";
        angkaGanjil = "";
        jumlahAngkaGanjil = 0;
        jumlahAngkaGenap = 0;

        System.out.print("Masukkan banyak angka yang akan diproses :");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka = input.nextInt();

            if (angka % 2 == 0) {
                angkaGenap += angka + " ";
                jumlahAngkaGenap += angka;
            } else {
                angkaGanjil += angka + " ";
                jumlahAngkaGanjil += angka;
            }
        }

        System.out.println();

        System.out.println("Termasuk angka genap : " + angkaGenap);
        System.out.println("Jumlah angka genap : " + jumlahAngkaGenap);
        System.out.println("Termasuk angka ganjil : " + angkaGanjil);
        System.out.println("Jumlah angka ganjil : " + jumlahAngkaGanjil);
    }
}
