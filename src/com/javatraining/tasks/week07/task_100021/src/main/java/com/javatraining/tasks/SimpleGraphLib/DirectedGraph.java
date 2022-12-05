package com.javatraining.tasks.SimpleGraphLib;

import java.util.*;
import org.slf4j.*;

public class DirectedGraph<T> implements Graph<T> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Graph.class);

    List<Vertex<T>> vertices;

    public DirectedGraph() {
        vertices = new ArrayList<>();
        LOGGER.debug("A new directed graph created");
    }

    @Override
    public void addVertex(Vertex<T> a) {
        if (!vertices.contains(a)) {
            vertices.add(a);
            LOGGER.debug("A vertex ({}) added to the graph", a.getValue());
        }
        LOGGER.debug("The vertex ({}) is already in the graph", a.getValue());
    }

    @Override
    public void addEdge(Vertex<T> from, Vertex<T> to) {
        addVertex(from);
        addVertex(to);
        from.addNeighbour(to);
        LOGGER.debug("An edge ({} -> {}) added to the graph", from.getValue(), to.getValue());
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
                    LOGGER.debug("A path between {} and {} found", from.getValue(), to.getValue());
                    return path;
                }
                vertices.get(vertices.indexOf(current)).getNeighbours().forEach(stack::push);
            }
        }

        LOGGER.debug("No path between {} and {} found", from.getValue(), to.getValue());
        return null;
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
