package Modul2.Percobaan;

public class PangkatA {
    public static void main(String[] args) {
        int hasilPangkat1;
        int hasilPangkat2;
        int hasilPenjumlahanPangkat;

        hasilPangkat1 = (int) Math.pow(2, 8);
        hasilPangkat2 = (int) Math.pow(4, 4);

        hasilPenjumlahanPangkat = hasilPangkat1 + hasilPangkat2;
        System.out.println("Hasil dari 2^8 + 4^4 adalah " + hasilPenjumlahanPangkat);
    }
}
