package src.com.javatraining.tasks.week04.task_100001;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getVolume() {
        return super.getVolume() * this.height;
    }
}
