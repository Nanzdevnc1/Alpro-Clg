package Modul7.Percobaan;

import javax.swing.JOptionPane;

public class Nomor3 {
    public static void main(String[] args) {
        int panjang, lebar, alas, tinggi, jari2;
        double luas_Persegi_Panjang, luas_Segitiga, luas_Lingkaran;

        panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang persegi panjang : "));
        lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar persegi panjang : "));
        luas_Persegi_Panjang = luasPersegiPanjang(panjang, lebar);
        JOptionPane.showMessageDialog(null, luas_Persegi_Panjang, "Luas Persegi Panjang", JOptionPane.INFORMATION_MESSAGE);

        alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas segitiga : "));
        tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi segitiga : "));
        luas_Segitiga = luasSegitiga(alas, tinggi);
        JOptionPane.showMessageDialog(null, luas_Segitiga, "Luas Segitiga", JOptionPane.INFORMATION_MESSAGE);

        jari2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran : "));
        luas_Lingkaran = luasLingkaran(jari2);
        JOptionPane.showMessageDialog(null, luas_Lingkaran, "Luas Lingkaran", JOptionPane.INFORMATION_MESSAGE);

    }

    private static double luasPersegiPanjang(int panjang, int lebar){
        double luas = 0;
        luas = panjang * lebar;
        return luas;
    }

    private static double luasSegitiga (int alas, int tinggi){
        double luas = 0;
        luas = (1.0/2.0) * alas * tinggi;
        return luas;
    }

    private static double luasLingkaran (int jari2){
        double luas = 0;
        luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
}
