import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DayOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isOutput1Full, isOutput2Full;
        int output1, output2 = 0;
        int total;
        String str = new String();
        isOutput1Full = false;
        isOutput2Full = false;

        str = scan.nextLine();
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (char c : ch) {
            if (Character.isDigit(c) && (!isOutput1Full)) {
                output1 = c;
                isOutput1Full = true;
            } else if (Character.isDigit(c) && (isOutput1Full)) {
                output2 = c;
                isOutput2Full = true;
            }
        }
        if (!(isOutput2Full)) {
            output2 = output1;
        }
        total = output1 + output2;
        output1 = 0;
        output2 = 0;

    }
}