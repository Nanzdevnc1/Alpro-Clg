package Modul7.Percobaan;

public class BacaKonsole {
    public static void main(String[] args) {
        System.out.print("Data1 = ");
        int data1 = InputConsole.readInt();

        System.out.print("Data2 = ");
        int data2 = InputConsole.readInt();
        int data3 = data1 + data2;
        System.out.println("Data 1 + Data 2 = " + data3);
    }
}
