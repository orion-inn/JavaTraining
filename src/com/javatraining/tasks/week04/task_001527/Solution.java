package src.com.javatraining.tasks.week04.task_001527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        // your code
        String[] params = url.substring(url.indexOf('?') + 1).split("&");
        Map<String, String> paramMap = new LinkedHashMap<>();

        for (String param : params) {
            String[] pair = param.split("=");
            paramMap.put(pair[0], pair.length == 2 ? pair[1] : null);
            System.out.print(pair[0] + " ");
        }
        System.out.println();

        if (!paramMap.containsKey("obj")) {
            return;
        }

        String objValue = paramMap.get("obj");

        try {
            if (objValue.contains("/")) {
                String[] fractional = objValue.split("/");
                objValue = ((double) Integer.parseInt(fractional[0]) / Integer.parseInt(fractional[1])) + "";
            }
            alert(Double.parseDouble(objValue));
        } catch (NumberFormatException err) {
            alert(objValue);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
