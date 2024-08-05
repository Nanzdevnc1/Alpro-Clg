package src.Modul2.Percobaan;

public class PangkatA {
    public static void main(String[] args) {
        int hasilPangkat1;
        int hasilPangkat2;
        int hasilPenjumlahan;

        hasilPangkat1 = (int) Math.pow(2, 8);
        hasilPangkat2 = (int) Math.pow(4, 4);

        hasilPenjumlahan = hasilPangkat1 + hasilPangkat2;
        System.out.println("Hasil dari 2^8 + 4^4 adalah " + hasilPenjumlahan);
    }
}
