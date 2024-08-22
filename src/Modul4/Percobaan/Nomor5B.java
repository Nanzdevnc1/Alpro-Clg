package Modul4.Percobaan;

import javax.swing.JOptionPane;

public class Nomor5B {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan Angka yang Anda Inginkan: ");
        int n = Integer.parseInt(angka);
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int l = n; l >= i ; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
