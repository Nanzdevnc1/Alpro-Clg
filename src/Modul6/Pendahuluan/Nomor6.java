package Modul6.Pendahuluan;

public class Nomor6 {
    public static void main(String[] args) {
        int data[][] = {{4,6,4,7,8,3,2,10}, {4,6,4,2,8,8,2,10}};
        int totalELement;
        double rataRata;

        totalELement = 0;
        rataRata = 0.0d;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rataRata += data[i][j];
                totalELement++;
            }
        }
        rataRata /= totalELement;
        System.out.println(rataRata);
    }
}
