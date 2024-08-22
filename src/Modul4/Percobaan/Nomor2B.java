package Modul4.Percobaan;

public class Nomor2B {
    public static void main(String[] args) {
        int angkaA, angkaB, faktorialA, faktorialB, hasil;
        
        angkaA = 5;
        angkaB = 4;
        faktorialA = 1;
        faktorialB = 1;

        for (int i = 1; i <= angkaA; i++) {
            faktorialA = 1;
            for (int j = 2; j <= i; j++) {
                faktorialA *= j;
            }
        }

        for (int i = 1; i <= angkaB; i++) {
            faktorialB = 1;
            for (int j = 1; j <= i; j++) {
                faktorialB *= j;
            }
        }

        hasil = faktorialA + faktorialB;
        System.out.println(hasil);
    }   
}
