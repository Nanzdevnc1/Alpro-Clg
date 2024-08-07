package src.Modul3.Percobaan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Apk1 {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3, nilaiTerbesar, nilaiTerkecil;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan nilai ketiga : ");
            nilai3 = Integer.parseInt(input.readLine());
            System.out.println("==============================");
            
            nilaiTerbesar = Integer.max(nilai1, Integer.max(nilai2, nilai3));
            System.out.println("Nilai terbesar adalah = " + nilaiTerbesar);
            nilaiTerkecil = Integer.min(nilai1, Integer.min(nilai2, nilai3));
            System.out.println("Nilai terkecil adalah = " + nilaiTerkecil);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
