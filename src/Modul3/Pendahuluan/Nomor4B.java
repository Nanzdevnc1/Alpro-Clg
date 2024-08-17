package Modul3.Pendahuluan;

import javax.swing.JOptionPane;

public class Nomor4B {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        String akhir;
        angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka pertama Anda"));
        angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka kedua Anda"));
        hasil = angka1 + angka2;
        akhir = "Hasil penjumlahan antara " + angka1 + " dan " + angka2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, akhir);
    }
}