package Modul2.Pendahuluan;

public class Operator {
    public static void main(String[] args) {
        // Contoh Penggunaan Operator Perbandingan
        byte x = 4;
        byte y = 3;
        boolean z;

        z = x != y;
        System.out.println(z);

        z = x == y;
        System.out.println(z);

        // Contoh Penggunaan Operator Increment/ Decrement
        byte d = 1;
        d++;
        System.out.println("Hasil incremnt: " + d);
        d--;
        System.out.println("Hasil Decremnt: " + d);

        // Contoh Penggunaan Operator Aritmatika
        byte a = 2;
        byte b = 3;
        byte c;

        c = (byte) (a + b);
        System.out.println("Hasil Penjumlahan dari " + a + " + " + b + " adalah " + c);
    }
}
