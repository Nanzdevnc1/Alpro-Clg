package Modul4.Percobaan;

public class CobaWhile {
    public static void main(String[] args) {
        double r = 0;
        int angka = 1;
        while (r < 0.99d) {
            r = Math.random();
            System.out.println(angka + ". " + r);
            angka++;
        }
    }
}
