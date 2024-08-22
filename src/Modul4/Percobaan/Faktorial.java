package Modul4.Percobaan;

public class Faktorial {
    public static void main(String[] args) {
        long batas;
        long faktorial = 1;
        batas = 4;
        for (int i = 0; i <= batas; i++) {
            faktorial = 1;
            for (int j = 2; j <= i; j++) {
                faktorial *= j;
                System.out.println(i + "!" + " adalah " + faktorial);
            }
        }
    }
}
