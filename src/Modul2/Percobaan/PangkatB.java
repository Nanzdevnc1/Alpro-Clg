package src.Modul2.Percobaan;

public class PangkatB {
    public static void main(String[] args) {
        int nilaiPangkat1;
        int nilaiPangkat2;
        int nilaiPangkat3;
        
        int hasilAkhir;

        nilaiPangkat1 = (int) Math.pow(2, 2);
        nilaiPangkat2 = (int) Math.pow(4, 1);
        nilaiPangkat3 = (int) Math.pow(2, 2);
        
        hasilAkhir = (nilaiPangkat1 + nilaiPangkat2) / nilaiPangkat3;
        System.out.println("Hasil akhir dari (2^2 + 4^1) / 2^2 bernilai " + hasilAkhir);
    }
}
