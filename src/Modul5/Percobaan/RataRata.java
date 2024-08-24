package Modul5.Percobaan;

public class RataRata {
    public static void main(String[] args) {
        double[] contoh = new double[30];
        double rataRata;
        for (int i = 0; i < contoh.length; i++) {
            contoh[i] = 100.0 * Math.random();
            rataRata = 0.0;
            for (int j = 0; j < contoh.length; j++) {
                rataRata += contoh[j];
                rataRata /= contoh.length;
            }
            System.out.println( i + ")" + " Mean 30 bilangan random adalah " + rataRata);
        }
    }
}
