package src.com.javatraining.tasks.week05.task_100002;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4.0 / 3.0, radius);
    }
}
