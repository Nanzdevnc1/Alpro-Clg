package Modul7.Percobaan;

import javax.swing.JOptionPane;

public class Metodx {
    
    public double luas_lingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println(luas);
    }

    // Tugas
    public double volumeKerucut(int diameter, int tinggi){
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2, 2) * tinggi * (1.0/3.0);
        return luas;
    }

    public static void main(String[] args) {
        Metodx mx = new Metodx();
        mx.hitungLuasLingkaran(10);

        System.out.println("====== Fungsi ======");
        System.out.print(mx.luas_lingkaran(20));

        System.out.println("\n====== Tugas ======");
        int n, tinggi;
        double volumeKerucut;
        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan diameter : "));
        tinggi = 7;
        volumeKerucut = mx.volumeKerucut(n, tinggi);
        JOptionPane.showMessageDialog(null, "Volume kerucut adalah " + volumeKerucut, "Volume", JOptionPane.INFORMATION_MESSAGE);
    }
}
