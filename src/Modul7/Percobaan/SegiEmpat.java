package Modul7.Percobaan;

public class SegiEmpat {
    public static void main(String[] args) {
        SegiEmpat bangun = new SegiEmpat();
        bangun.segiEmpat(9, 5);
    }

    private void segiEmpat(int panjang, int lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println("----------------------------");
        System.out.println("Panjang Segi Empat : " + panjang);
        System.out.println("Lebar Segi Empat " + lebar);
        System.out.println("Luas Persegi Empat " + luas + " cm");
    }
}
