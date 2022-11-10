package src.com.javatraining.tasks.week04.task_100001;

public class Solution {

    public static void main(String[] args) {
        Box box = new Box(100);
        System.out.println(box.getVolume());

        Pyramid p = new Pyramid(7, 3);
        System.out.println("Pyramid volume: " + p.getVolume());

        Cylinder c = new Cylinder(2, 3);
        System.out.println("Cylinder volume: " + c.getVolume());
        System.out.println("Cylinder radius: " + c.getRadius());

        Ball b = new Ball(3);
        System.out.println("Ball volume: " + b.getVolume());
        System.out.println("Ball radius: " + b.getRadius());

        System.out.println("Put the pyramid into the box: " + box.add(p));
        System.out.println("Put the cylinder into the box: " + box.add(c));
        System.out.println("Put the ball into the box: " + box.add(b));
        System.out.println("Put the cylinder into the box: " + box.add(c));
    }
}
