package src.Modul3.Percobaan;

import javax.swing.JOptionPane;

public class Salesman {
    public static void main(String[] args) {
        int penjualan;
        double komisi, pendapatan;
        penjualan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nominal pendapatan hari ini"));
    
        if (penjualan <= 2000000) {
            komisi = penjualan * 0.1;
            pendapatan = komisi + 100000;
            JOptionPane.showMessageDialog(null, "Pendapatan Anda hari ini adalah " + pendapatan);
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            komisi = penjualan * 0.15;
            pendapatan = komisi + 200000;
            JOptionPane.showMessageDialog(null, "Pendapatan Anda hari ini adalah " + pendapatan);
        } else { // Di atas Rp.5.000.000
            komisi = penjualan * 0.2;
            pendapatan = komisi + 300000;
            JOptionPane.showMessageDialog(null, "Pendapatan Anda hari ini adalah " + pendapatan);
        } 
    }
}
