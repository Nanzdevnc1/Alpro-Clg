package Modul7.Percobaan;

public class BacaKonsole {
    public static void main(String[] args) {
        InputConsole ic = new InputConsole();
        System.out.print("Data1 = ");
        int data1 = ic.readInt();

        System.out.print("Data2 = ");
        int data2 = ic.readInt();
        int data3 = data1 + data2;
        System.out.println("Data 1 + Data 2 = " + data3);
    }
}
