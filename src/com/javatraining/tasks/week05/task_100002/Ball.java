package src.com.javatraining.tasks.week05.task_100002;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 3) * 4.0 / 3.0;
    }
}
