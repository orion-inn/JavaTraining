package com.javatraining.tasks.SimpleGraphLib;

import java.util.List;

public interface Graph<T> {

    //adds vertex to the graph
    void addVertex(Vertex<T> a);

    //adds edge to the graph
    void addEdge(Vertex<T> from, Vertex<T> to);

    //returns a list of edges between 2 vertices (path doesn’t have to be optimal)
    List<Vertex<T>> getPath(Vertex<T> from, Vertex<T> to);

}
