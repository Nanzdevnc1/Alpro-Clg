package Modul5.Pendahuluan;

public class NewClass2 {
    public static void main(String[] args) {
        int data[] = { 2, 6, 4, 2, 8, 4, 2, 11 };

        System.out.println("====== Print dengan For Loop ======");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println("\n====== Print dengan While Loop ======");
        int x;
        x = 0;
        while (x < data.length) {
            System.out.print(data[x] + " ");
            x++;
        }

        System.out.println("\n====== Print dengan Do While Loop ======");
        int y;
        y = 0;
        do {
            System.out.print(data[y] + " ");
            y++;
        } while (y < data.length);
    }
}