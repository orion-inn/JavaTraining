package src.com.javatraining.tasks.week04.task_100001;

import java.util.*;

public class Box extends Shape {

    private List<Shape> box;
    private double freeSpace;

    public Box(double volume) {
        super(volume);
        this.box = new ArrayList<>();
        this.freeSpace = volume;
    }

    public boolean add(Shape shape) {
        if (shape.getVolume() <= freeSpace) {
            box.add(shape);
            freeSpace -= shape.getVolume();
            return true;
        }
        return false;
    }
}
