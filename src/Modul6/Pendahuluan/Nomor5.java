package Modul6.Pendahuluan;

public class Nomor5 {
    public static void main(String[] args) {
        int data[][] = { { 4, 6, 4, 7, 8, 3, 2, 10 }, { 4, 6, 4, 2, 8, 8, 2, 10 } };
        int x, y;
        // Print dengan menggunkan for loop
        System.out.println("===== FOR LOOP ======");
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ", ");
            }
            System.out.println("]");
        }

        System.out.println("\n===== WHILE LOOP ======");
        x = 0;
        while (x < data.length) {
            y = 0;
            while (y < data[x].length) {
                System.out.print(data[x][y] + ", ");
                y++;
            }
            x++;
            System.out.println();
        }

        System.out.println("\n===== DO WHILE LOOP ======");
        x = 0;
        do {
            y = 0;
            do {
                System.out.print(data[x][y] + ", ");
                y++;
            } while (y < data[x].length);
            x++;
            System.out.println();
        } while (x < data.length);
    }
}
