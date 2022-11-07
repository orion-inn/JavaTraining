package src.com.javatraining.tasks.week04.task_003009;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        Set<Integer> radixes = new HashSet<>();

        int n;

        try {
            n = Integer.parseInt(number);
        } catch (NumberFormatException err) {
            return radixes;
        }

        for (int radix = 2; radix < 36; radix++) {
            if (isPalindrome(Integer.toString(n, radix)))
                radixes.add(radix);
        }

        return radixes;
    }

    private static boolean isPalindrome (String s) {
        StringBuilder reversedS = new StringBuilder(s);
        reversedS.reverse();
        return (s.equals(reversedS.toString()));
    }
}