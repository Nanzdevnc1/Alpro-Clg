package Modul5.Pendahuluan;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int input;
        int data[] = { 2, 6, 4, 2, 8, 4, 2, 11 };
        boolean foundKey = false;

        input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang ingin dicari : "));
        for (int i = 0; i < data.length; i++) {
            if (input == data[i]) {
                foundKey = true;
                JOptionPane.showMessageDialog(null, "Angka tersebut berada di index ke-" + i + " ");
            }
        }
        if (!foundKey) {
            JOptionPane.showMessageDialog(null, "Angka tersebut tidak ditemukan");

        }
    }
}
