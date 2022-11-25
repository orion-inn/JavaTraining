package com.javatraining.tasks.SimpleGraphLib;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    private T value;
    private final List<Vertex<T>> neighbours;

    public Vertex(T value) {
        this.value = value;
        this.neighbours = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Vertex<T>> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Vertex<T> neighbour) {
        if (!neighbours.contains(neighbour)) {
            this.neighbours.add(neighbour);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex<?> vo))
            return false;
        return vo.value == null ? this.value == vo.value : vo.value.equals(this.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }
}
