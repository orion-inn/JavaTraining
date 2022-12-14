package src.com.javatraining.tasks.week05.task_100002;

import java.util.*;

public class Box extends Shape {

    private List<Shape> shapes;
    private double freeSpace;

    public Box(double volume) {
        super(volume);
        this.shapes = new ArrayList<>();
        this.freeSpace = volume;
    }

    public boolean add(Shape shape) {
        if (shape.getVolume() <= freeSpace) {
            shapes.add(shape);
            freeSpace -= shape.getVolume();
            return true;
        }
        return false;
    }
}
