package Modul3.Pendahuluan;

import java.util.Scanner;

public class Nomor3E {
    public static void main(String[] args) {
        String kota;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama kota : ");
        kota = input.nextLine();

        switch (kota.toLowerCase()) {
            case "malang":
                System.out.println("Selamat datang di kota " + kota);
                break;
            case "jakarta":
                System.out.println("Selamat datang di kota " + kota);
                break;
            case "surabaya":
                System.out.println("Selamat datang di kota " + kota);
                break;
            default:
                System.out.println("Anda belum memasuki kota yang terdaftar");
                break;
        }
        input.close();
    }
}
