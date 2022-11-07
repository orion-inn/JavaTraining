package src.com.javatraining.tasks.week04.task_100001;

import java.util.*;

public class Box extends Shape {

    private List<Shape> box;

    public Box(double volume) {
        super(volume);
        this.box = new ArrayList<>();
    }

    public boolean add(Shape shape) {
        double freeSpace = this.getVolume();

        for (Shape shapeInBox : box) {
            freeSpace -= shapeInBox.getVolume();
        }

        if (shape.getVolume() > freeSpace) {
            return false;
        }

        return box.add(shape);
    }
}
