package src.Modul3.Pendahuluan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nomor4A {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan angka pertama Anda : ");
            angka1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan angka kedua Anda : ");
            angka2 =Integer.parseInt(input.readLine());
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan dari angka pertama dan kedua Anda adalah " + hasil);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
