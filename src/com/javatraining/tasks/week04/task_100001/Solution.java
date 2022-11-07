package src.com.javatraining.tasks.week04.task_100001;

public class Solution {

    public static void main(String[] args) {
        Box box = new Box(100);
        System.out.println(box.getVolume());

        Pyramid p = new Pyramid(20, 3);
        System.out.println("Pyramid: " + p.getVolume());

        Cylinder c = new Cylinder(2, 3);
        System.out.println("Cylinder: " + c.getVolume());

        Ball b = new Ball(3);
        System.out.println("Ball: " + b.getVolume());

        System.out.println("Put the pyramid into the box: " + box.add(p));
        System.out.println("Put the cylinder into the box: " + box.add(c));
        System.out.println("Put the ball into the box: " + box.add(b));
        System.out.println("Put the pyramid into the box: " + box.add(p));
    }
}
