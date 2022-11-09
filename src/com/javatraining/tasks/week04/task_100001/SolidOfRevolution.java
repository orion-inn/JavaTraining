package src.com.javatraining.tasks.week04.task_100001;

public class SolidOfRevolution extends Shape {

    private double radius;

    public SolidOfRevolution (double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
