package Modul5.Percobaan;

import javax.swing.JOptionPane;

public class NewClass3 {
    public static void main(String[] args) {
        int[] data = new int[10];
        int max, min, indexMax, indexMin, key;
        double rataRata;
        boolean found;
        String pesan = "";

        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element index ke-" + a));
            System.out.print("Index ke " + a + " adalah " + data[a]);
        }

        rataRata = 0.0d;
        for (int i = 0; i < data.length; i++) {
            rataRata += data[i];
        }
        rataRata /= data.length;

        max = data[0];
        min = data[0];
        indexMax = 0;
        indexMin = 0;
        found = false;

        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
                indexMax = i;
            }
            if (min > data[i]) {
                min = data[i];
                indexMin = i;
            }
        }
        pesan = "Nilai Maksimal = " + max + ", berada di index ke- " + indexMax +"\n" + "Nilai Minimal = " + min + ", berada di index ke-" + indexMin + "\n" ;
        JOptionPane.showMessageDialog(null, pesan);
        JOptionPane.showMessageDialog(null, "Rata-Rata Nilai adalah = " + rataRata);

        key = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang ingin dicari : "));
        for (int i = 0; i < data.length; i++) {
            if (key == data[i]) {
                JOptionPane.showMessageDialog(null, "Angka tersebut berada di index ke- " + i);
                found = true;
                key = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka baru"));
                data[i] = key;
                for (int j = 0; j < data.length; j++) {
                    System.out.print("" + data[j] + " ");
                }
            }
        }
        if (found == false) {
            JOptionPane.showMessageDialog(null, "Nilai tersebut tidak ditemukan");
        }
    }
}
