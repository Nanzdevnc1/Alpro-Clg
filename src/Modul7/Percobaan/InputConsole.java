package Modul7.Percobaan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputConsole {
    public static String readString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = " ";
        try {
            string = bfr.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        return string;
    }

    public static int readInt() {
        return Integer.parseInt(readString());
    }

    public static double readDouble(){
        return Double.parseDouble(readString());
    }

}
