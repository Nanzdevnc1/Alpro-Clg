package src.Modul3.Pendahuluan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.io.IOException;

public class Nomor1 {
    public static void main(String[] args) {

        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        int x, y, luas;

        try {
            System.out.print("Masukkan panjang : ");
            x = Integer.parseInt(inputUser.readLine());
            System.out.print("Masukkan lebar : ");
            y = Integer.parseInt(inputUser.readLine());
            luas = x * y;
            System.out.println("Luas persegi panjang adalah " + luas);
        } catch (Exception e) {
            System.out.println("Error !");
        } 
    }
}
