package src.com.javatraining.tasks.week05.task_002705;

/* 
Второй вариант deadlock
*/

public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        doSomething();
    }

    private void doSomething() {
    }

    public static void main(String[] args) {

    }
}
