package Modul6.Percobaan;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int data[][] = { { 4, 6, 4, 2, 8, 4, 2, 10 }, { 4, 6, 4, 2, 8, 4, 2, 10 } };
        int x, y, komponen, n, value, jumlahIndexGenap, jumlahIndexGanjil;
        double rataRata;
        boolean found;

        System.out.println("====== WHILE LOOP ======");
        x = 0;
        while (x < data.length) {
            y = 0;
            while (y < data[0].length) {
                System.out.print(data[x][y] + ", ");
                y++;
            }
            x++;
            System.out.println();
        }

        System.out.println("======\n DO WHILE LOOP ======");
        x = 0;
        do {
            y = 0;
            do {
                System.out.print(data[x][y] + ", ");
                y++; 
            } while (y < data[0].length);
            x++;
            System.out.println();
        } while (x < data.length);

        System.out.println("====== Rata Rata ======");
        rataRata = 0.0d;
        komponen = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                rataRata += data[i][j];
                komponen++;
            }
        }
        rataRata /= komponen;
        System.out.println("Rata-rata pada Array tersebut adalah " + rataRata);

        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari"));
        found = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (n == data[i][j]) {
                    found = true;
                    JOptionPane.showMessageDialog(null, "Nilai tersebut berada di index " +"[" +i + "]" + "[" + j + "]", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Nilai tersebut tidak ditemukan");
            return;
        }

        value = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru :"));
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == n){
                    data[i][j] = value;
                }
            }
        }

        System.out.println("====== Array Baru ======");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("====== Jumlah Index Ganjil & Genap ======");
        jumlahIndexGenap = 0;
        jumlahIndexGanjil = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (j % 2 == 0) {
                    jumlahIndexGenap += data[i][j]; 
                } else {
                    jumlahIndexGanjil += data[i][j];
                }
            }
        }

        System.out.println("Jumlah semua element yang memiliki index ganjil : " + jumlahIndexGanjil);
        System.out.println("Jumlah semua element yang memiliki index genap : " + jumlahIndexGenap);
    }
}
