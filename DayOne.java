import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DayOne {
    public static void main(String[] args) {
        String filePath = "dayOne.txt";

        boolean isOutput1Full, isOutput2Full;
        int output1 = 0;
        int output2 = 0;
        int total = 0;
        String str;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((str = reader.readLine()) != null) {
                isOutput1Full = false;
                isOutput2Full = false;

                char[] ch = str.toCharArray();

                for (char c : ch) {
                    if (Character.isDigit(c)) {
                        int digitValue = c - '0';
                        if (!isOutput1Full) {
                            output1 = digitValue;
                            isOutput1Full = true;
                        } else if (isOutput1Full && !isOutput2Full) {
                            output2 = digitValue;
                            isOutput2Full = true;
                        }
                    }
                }
                if (!(isOutput2Full)) {
                    output2 = output1;
                }
                total += (output1*10) + output2;
                output1 = 0;
                output2 = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
        System.out.println(total);
    }
}