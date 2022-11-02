package src.com.javatraining.tasks.week03.task_001409;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        System.out.printf("%d cars on %s%n",
                bridge.getCarsCount(), bridge.getClass().getSimpleName());
    }
}

