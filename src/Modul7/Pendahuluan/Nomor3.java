package Modul7.Pendahuluan;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4 };
        int n, hasil;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan index array : ");
        n = input.nextInt();

        hasil = 0;
        try {
            hasil = data[n];
            System.out.println("Index tersebut diisi oleh angka : " + hasil);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            input.close();
            System.out.println("Program Selesai");
        }
    }
}