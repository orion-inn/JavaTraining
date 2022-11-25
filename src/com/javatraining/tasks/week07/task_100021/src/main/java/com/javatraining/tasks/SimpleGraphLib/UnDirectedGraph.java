package com.javatraining.tasks.SimpleGraphLib;

public class UnDirectedGraph<T> extends DirectedGraph<T> {

    @Override
    public void addEdge(Vertex<T> from, Vertex<T> to) {
        super.addEdge(from, to);
        to.addNeighbour(from);
    }
}
