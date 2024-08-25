package Modul6.Pendahuluan;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int n, data[][] = {{4,6,4,7,8,3,2,10}, {4,6,4,2,8,8,2,10}};
        boolean found;
        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));

        found = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (n == data[i][j]) {
                    JOptionPane.showMessageDialog(null, "Nilai tersebut berada di index ke-" + i + ", " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Nilai tersebut tidak ditemukan");
        }

    }    
}
