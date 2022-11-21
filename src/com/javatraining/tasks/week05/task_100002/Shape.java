package src.com.javatraining.tasks.week05.task_100002;

public interface Shape extends Comparable<Shape> {
    double getVolume();

    @Override
    default int compareTo(Shape other) {
        if (this.getVolume() < other.getVolume()) {
            return -1;
        } else if (this.getVolume() > other.getVolume()) {
            return 1;
        } else {
            return 0;
        }
    }
}
