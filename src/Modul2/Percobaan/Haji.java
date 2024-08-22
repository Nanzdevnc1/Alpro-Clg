package Modul2.Percobaan;

public class Haji {
    public static void main(String[] args) {
        int biayaHaji = 50000000;
        int bukaTabungan = 10000000;
        byte sisaBulan = 23;
        float sisaBiaya;
        float cicilanHaji;

        sisaBiaya = biayaHaji - bukaTabungan;
        cicilanHaji = sisaBiaya / sisaBulan;
        System.out.println("Sehingga minimal cicilan yang harus dibayarkan adalah " + cicilanHaji + " Rupiah");
    }
}
