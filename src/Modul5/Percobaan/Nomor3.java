package Modul5.Percobaan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nomor3 {
    public static void main(String[] args) {
        int n, max, min, indexMax, indexMin, indexGanjil;
        int []data;
        double rataRata;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan panjang Array : ");
            n = Integer.parseInt(input.readLine());
            data = new int[n];
            for (int i = 0; i < data.length; i++) {
                data[i] = i;
            }

            max = data[0];
            min = data[0];
            indexMax = 0;
            indexMin = 0;

            for (int j = 0; j < data.length; j++) {
                if (max < data[j]) {
                    max = data[j];
                    indexMax = j;
                }
                if (min > data[j]) {
                    min = data[j];
                    indexMin = j;
                }
            }
            System.out.println("Nilai terbesar pada Array adalah " + max + ", berada di index ke-" + indexMax);
            System.out.println("Nilai terkecil pada Array adalah " + min + ", berada di index ke-" + indexMin);

            rataRata = 0.0d;
            for (int i = 0; i < data.length; i++) {
                rataRata += data[i];
            }
            rataRata /= data.length;
            System.out.println("Rata-rata nilai pada Array adalah " + rataRata);

            indexGanjil = 0;
            for (int i = 0; i < data.length; i++) {
                if (i % 2 == 1) {
                    indexGanjil += data[i];
                }
            }
            System.out.println("Jumlah nilai yang memiliki index ganjil adalah " + indexGanjil);
            if (indexGanjil % 2 == 1) {
                System.out.println("Jumlahnya ganjil");
            } else {
                System.out.println("Jumlahnya genap");
            }

            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
}