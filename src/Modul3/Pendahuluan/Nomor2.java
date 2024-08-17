package Modul3.Pendahuluan;

import javax.swing.JOptionPane;

public class Nomor2 {
    public static void main(String[] args) {
        String nama, pesan;
        int umur;

        nama = JOptionPane.showInputDialog("Masukkan nama Anda");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur Anda"));
        pesan = "Terus berusahalah " + nama + " walaupun umur sudah " + umur + " karena 'the time is closing down'";
        JOptionPane.showMessageDialog(null, pesan);
    }
}
