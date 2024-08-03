package Modul2.Pendahuluan;

public class Konversi {
    public static void main(String[] args) {
        byte a = 10;
        short b = 4;
        int c = 2;
        long d = 50L;
        int e = 15;

        // Konfersi dari byte ke short
        short nilaiShort = (short) a;
        System.out.println("Nilai short: " + nilaiShort);

        // Konversi dari short ke int
        int nilaiInt = (int) b;
        System.out.println("Nilai int: " + nilaiInt);

        // Konversi dari int ke long
        long nilaiLong = (long) c;
        System.out.println("Nilai long: " + nilaiLong);
        
        // Konversi dari int ke long
        int nilaiIntL = (int) d;
        System.out.println("Nilai int: " + nilaiIntL);

        // Casting 
        float hasilBagi = (float)e / c;
        System.out.println("Hasil pembagian dari " + e / c + " adalah : " + hasilBagi );

    }
}
