package src.com.javatraining.tasks.week04.task_100001;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getVolume() {
        return super.getVolume() * this.getRadius() * 4.0 / 3.0;
    }
}
