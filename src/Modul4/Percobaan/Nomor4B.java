package Modul4.Percobaan;

import javax.swing.JOptionPane;

public class Nomor4B {
    public static void main(String[] args) {
        int n, angka, jumlahAngkaGanjil, jumlahAngkaGenap;
        String angkaGenap, angkaGanjil, pesan;

        angkaGenap = "";
        angkaGanjil = "";
        jumlahAngkaGanjil = 0;
        jumlahAngkaGenap = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan banyak angka yang akan diproses :"));
        for (int i = 0; i < n; i++) {
            angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-" + (i+1)));
            if (angka % 2 == 0) {
                angkaGenap += angka + " ";
                jumlahAngkaGenap += angka;
            } else {
                angkaGanjil += angka + " ";
                jumlahAngkaGanjil += angka;
            }
        }

        pesan = "Termasuk golongan angka genap : " + angkaGenap + "\n" +
                "Jumlah angka genap : " + jumlahAngkaGenap + "\n" + 
                "Termasuk golongan angka ganjil : " + angkaGanjil + "\n" +
                "Jumlah angka ganjil : " + jumlahAngkaGanjil + "\n";

        JOptionPane.showMessageDialog(null, pesan);
        
    }
}
