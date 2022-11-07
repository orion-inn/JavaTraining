package src.com.javatraining.tasks.week04.task_100001;

public class SolidOfRevolution extends Shape {

    private double radius;

    public SolidOfRevolution (double radius) {
        super(Math.PI * Math.pow(radius, 2));
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
