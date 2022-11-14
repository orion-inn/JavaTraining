package src.com.javatraining.tasks.week05.task_100002;

public abstract class SolidOfRevolution implements Shape {

    private double radius;

    public SolidOfRevolution (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
