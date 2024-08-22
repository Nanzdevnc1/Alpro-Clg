package Modul2.Percobaan;

public class Pajak {
    public static void main(String[] args) {
        int gajiKotor = 3000000;
        float pajak = 0.1f;
        float gajiBersih;
        float potongan;

        System.out.println("Gaji kotor sebesar " + gajiKotor + " Rupiah");

        potongan = (float) gajiKotor * pajak;
        System.out.println("Potongan sebesar " + potongan + " Rupiah");

        gajiBersih = gajiKotor - potongan;
        System.out.println("Sehingga gaji bersih sebesar " + gajiBersih + " Rupiah");

    }
}
