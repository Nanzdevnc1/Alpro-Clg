package Modul2.Percobaan;

public class RataRata {
    public static void main(String[] args) {
        byte angka1 = 30;
        byte angka2 = 30;
        byte angka3 = 60;
        byte rataRata;

        rataRata = (byte) ((angka1 + angka2 + angka3) / 3);
        System.out.println("Hasil rata rata bilangan tersebut adalah " + rataRata);
    }
}
