package src.com.javatraining.tasks.week04.task_001519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while ((line = reader.readLine()) != null && !line.equals("exit")) {
            try {
                if (line.contains(".")) {
                    print(Double.valueOf(line));
                    continue;
                }

                int number = Integer.parseInt(line);
                if (number > 0 && number < 128) {
                    print((short) number);
                } else {
                    print(number);
                }
            } catch (NumberFormatException err) {
                print(line);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("This is Double, value = " + value);
    }

    public static void print(String value) {
        System.out.println("This is String, value = " + value);
    }

    public static void print(short value) {
        System.out.println("This is short, value = " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is Integer, value = " + value);
    }
}
