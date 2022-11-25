package com.javatraining.tasks.SimpleGraphLib;

import java.util.*;

public class DirectedGraph<T> implements Graph<T> {
    List<Vertex<T>> vertices;

    public DirectedGraph() {
        vertices = new ArrayList<>();
    }

    @Override
    public void addVertex(Vertex<T> a) {
        if (!vertices.contains(a)) {
            vertices.add(a);
        }
    }

    @Override
    public void addEdge(Vertex<T> from, Vertex<T> to) {
        addVertex(from);
        addVertex(to);
        from.addNeighbour(to);
    }

    @Override
    public List<Vertex<T>> getPath(Vertex<T> from, Vertex<T> to) {
        List<Vertex<T>> path = new ArrayList<>();
        Deque<Vertex<T>> stack = new LinkedList<>();
        Set<Vertex<T>> visited = new HashSet<>();

        stack.push(from);

        while (!stack.isEmpty()) {
            Vertex<T> current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                path.add(current);
                if (current.equals(to)) {
                    break;
                }
                vertices.get(vertices.indexOf(current)).getNeighbours().forEach(stack::push);
            }
        }

        return path;
    }

    public void printGraph() {
       for (Vertex<T> v : vertices)  {
           System.out.printf("%s ->", v.getValue());
           for (Vertex<T> w : v.getNeighbours()) {
               System.out.printf(" %s", w.getValue());
           }
           System.out.println();
       }
    }
}
