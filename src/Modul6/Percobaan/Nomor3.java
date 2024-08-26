package Modul6.Percobaan;

public class Nomor3 {
    public static void main(String[] args) {
        String data [][] = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992", "Trenggalek"}, {"PONIRAN", "085646668999", "Bojonegoro"}};

        System.out.printf("%-10s %-15s %-12s%n", "NAMA", "ALAMAT", "TELEPONE");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-15s %-12s%n", data[i][0], data[i][2], data[i][1]);
        }
    }
}
