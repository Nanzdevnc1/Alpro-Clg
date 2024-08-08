package src.Modul3.Percobaan;

public class Siswa {
    public static void main(String[] args) {
        int nilaiSiswa1, nilaiSiswa2, nilaiSiswa3, nilaiSiswa4, nilaiTerbesar, nilaiTerkecil;
        String nilaiHurufSiswa1, nilaiHurufSiswa2, nilaiHurufSiswa3, nilaiHurufSiswa4;
        String namaSiswa1, namaSiswa2, namaSiswa3, namaSiswa4;

        namaSiswa1 = "Adi";
        namaSiswa2 = "Budi";
        namaSiswa3 = "Caca";
        namaSiswa4 = "Deny";

        nilaiSiswa1 = 70;
        nilaiSiswa2 = 65;
        nilaiSiswa3 = 90;
        nilaiSiswa4 = 75;

        if (nilaiSiswa1 >= 36 && nilaiSiswa1 <= 45) {
            nilaiHurufSiswa1 = "D";
        } else if (nilaiSiswa1 >= 46 && nilaiSiswa1 <= 55) {
            nilaiHurufSiswa1 = "C";
        } else if (nilaiSiswa1 >= 56 && nilaiSiswa1 <= 65) {
            nilaiHurufSiswa1 = "C+";
        } else if (nilaiSiswa1 >= 66 && nilaiSiswa1 <= 75) {
            nilaiHurufSiswa1 = "B";
        } else if (nilaiSiswa1 >= 76 && nilaiSiswa1 <= 85) {
            nilaiHurufSiswa1 = "B+";
        } else if (nilaiSiswa1 >= 86 && nilaiSiswa1 <= 100) {
            nilaiHurufSiswa1 = "A";
        } else {
            nilaiHurufSiswa1 = "Sorry dude";
        }

        if (nilaiSiswa2 >= 36 && nilaiSiswa2 <= 45) {
            nilaiHurufSiswa2 = "D";
        } else if (nilaiSiswa2 >= 46 && nilaiSiswa2 <= 55) {
            nilaiHurufSiswa2 = "C";
        } else if (nilaiSiswa2 >= 56 && nilaiSiswa2 <= 65) {
            nilaiHurufSiswa2 = "C+";
        } else if (nilaiSiswa2 >= 66 && nilaiSiswa2 <= 75) {
            nilaiHurufSiswa2 = "B";
        } else if (nilaiSiswa2 >= 76 && nilaiSiswa2 <= 85) {
            nilaiHurufSiswa2 = "B+";
        } else if (nilaiSiswa2 >= 86 && nilaiSiswa2 <= 100) {
            nilaiHurufSiswa2 = "A";
        } else {
            nilaiHurufSiswa2 = "Sorry dude";
        }

        if (nilaiSiswa3 >= 36 && nilaiSiswa3 <= 45) {
            nilaiHurufSiswa3 = "D";
        } else if (nilaiSiswa3 >= 46 && nilaiSiswa3 <= 55) {
            nilaiHurufSiswa3 = "C";
        } else if (nilaiSiswa3 >= 56 && nilaiSiswa3 <= 65) {
            nilaiHurufSiswa3 = "C+";
        } else if (nilaiSiswa3 >= 66 && nilaiSiswa3 <= 75) {
            nilaiHurufSiswa3 = "B";
        } else if (nilaiSiswa3 >= 76 && nilaiSiswa3 <= 85) {
            nilaiHurufSiswa3 = "B+";
        } else if (nilaiSiswa3 >= 86 && nilaiSiswa3 <= 100) {
            nilaiHurufSiswa3 = "A";
        } else {
            nilaiHurufSiswa3 = "Sorry dude";
        }

        if (nilaiSiswa4 >= 36 && nilaiSiswa4 <= 45) {
            nilaiHurufSiswa4 = "D";
        } else if (nilaiSiswa4 >= 46 && nilaiSiswa4 <= 55) {
            nilaiHurufSiswa4 = "C";
        } else if (nilaiSiswa4 >= 56 && nilaiSiswa4 <= 65) {
            nilaiHurufSiswa4 = "C+";
        } else if (nilaiSiswa4 >= 66 && nilaiSiswa4 <= 75) {
            nilaiHurufSiswa4 = "B";
        } else if (nilaiSiswa4 >= 76 && nilaiSiswa4 <= 85) {
            nilaiHurufSiswa4 = "B+";
        } else if (nilaiSiswa4 >= 86 && nilaiSiswa4 <= 100) {
            nilaiHurufSiswa4 = "A";
        } else {
            nilaiHurufSiswa4 = "Sorry dude";
        }

        System.out.println("================DAFTAR NILAI=================");
        System.out.println(namaSiswa1 + " : " + nilaiSiswa1 + " -> " + nilaiHurufSiswa1);
        System.out.println(namaSiswa2 + " : " + nilaiSiswa2 + " -> " + nilaiHurufSiswa2);
        System.out.println(namaSiswa3 + " : " + nilaiSiswa3 + " -> " + nilaiHurufSiswa3);
        System.out.println(namaSiswa4 + " : " + nilaiSiswa4 + " -> " + nilaiHurufSiswa4);

        System.out.println("==================NILAI TERBESAR & TERKECIL====================");
        nilaiTerbesar = Integer.max(nilaiSiswa1, Integer.max(nilaiSiswa2, Integer.max(nilaiSiswa3, nilaiSiswa4)));
        nilaiTerkecil = Integer.min(nilaiSiswa1, Integer.min(nilaiSiswa2, Integer.min(nilaiSiswa3, nilaiSiswa4)));
        System.out.println("Nilai terbesar : " + nilaiTerbesar);
        System.out.println("Nilai terkecil : " + nilaiTerkecil);
    }
}