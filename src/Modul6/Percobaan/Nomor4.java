package Modul6.Percobaan;

import javax.swing.JOptionPane;

public class Nomor4 {
    public static void main(String[] args) {
        int[][] data = { { 2, 9 }, { 1, 5 } };
        int[][] data2 = { { 5, 17 }, { 10, 4 } };
        int[][] hasil = new int[data.length][data[0].length];
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (n == data[i][j]) {
                    JOptionPane.showMessageDialog(null, "Angka tersebut berada di index " + "[" + i + "]" + "[" + j + "]", "Hasilnya", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                hasil[i][j] = data[i][j] + data2[i][j];
            }
        }

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                System.out.print(hasil[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
