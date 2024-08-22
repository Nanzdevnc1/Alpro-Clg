package Modul4.Percobaan;

public class Nomor2C {
    public static void main(String[] args) {
        int basisA, basisB, pangkatA, pangkatB, hasilA, hasilB;
        basisA = 4;
        basisB = 5;
        pangkatA = 2;
        pangkatB = 1;
        hasilA = 1;
        hasilB = 1;
        float hasil;

        for (int i = 1; i <= pangkatA; i++) {
            hasilA *= basisA;
        }

        for (int i = 1; i <= pangkatB; i++) {
            hasilB *= basisB;
        }
        
        hasil = (float) (hasilA + hasilB) / hasilB + hasilA;   
        System.out.println(hasil);
    }
}
