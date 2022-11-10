package src.com.javatraining.tasks.week04.task_100001;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super((s * h) / 3.0);
        this.s = s;
        this.h = h;
    }

}
