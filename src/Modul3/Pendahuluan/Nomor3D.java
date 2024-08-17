package Modul3.Pendahuluan;

public class Nomor3D {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 10;
        if (x < y) {
            if (x == 5 && y == 10) {
                System.out.println("Kondisi awal terpenuhi");
            } else if (x != 5 && y != 10) {
                System.out.println("Kondisi kedua terpenuhi");
            }
        } else {
            System.out.println("Kondisi tidak terpenuhi");
        }
    }
}
