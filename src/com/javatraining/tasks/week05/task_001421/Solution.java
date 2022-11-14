package src.com.javatraining.tasks.week05.task_001421;

/* 
Singleton
*/

public class Solution {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 + " == " + s2 + "? " + (s1 == s2));
    }
}
