// Tidak boleh menggunakan Math.pow
// 4^3 + 5^2
package Modul4.Percobaan;

public class Nomor2A {
    public static void main(String[] args) {
        int basisA, pangkatA, basisB, pangkatB, hasil, hasilA, hasilB;
        basisA = 4;
        pangkatA = 3;
        hasilA = 1;

        // Menghitung nilai A
        for (int i = 0; i < pangkatA; i++) {
            hasilA *= basisA;
        }

        basisB = 5;
        pangkatB = 2;
        hasilB = 1;
        for (int i = 0; i < pangkatB; i++) {
            hasilB *= basisB;
        }

        hasil = hasilA + hasilB;
        System.out.println(hasil);
    }
}
