package src.com.javatraining.tasks.week04.task_100001;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }
}
