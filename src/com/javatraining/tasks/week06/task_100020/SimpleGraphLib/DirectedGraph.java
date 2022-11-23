package src.com.javatraining.tasks.week06.task_100020.SimpleGraphLib;

import java.util.*;

public class DirectedGraph implements Graph {
    List<Vertex> vertices;

    public DirectedGraph() {
        vertices = new ArrayList<>();
    }

    @Override
    public void addVertex(Vertex a) {
        if (!vertices.contains(a)) {
            vertices.add(a);
        }
    }

    @Override
    public void addEdge(Vertex from, Vertex to) {
        addVertex(from);
        from.addNeighbour(to);
    }

    @Override
    public List<Vertex> getPath(Vertex from, Vertex to) {
        List<Vertex> path = new ArrayList<>();
        Deque<Vertex> stack = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        stack.push(from);

        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                path.add(current);
                if (current.equals(to)) {
                    break;
                }
                current.getNeighbours().forEach(neighbour -> stack.push((Vertex) neighbour));
            }
        }

        return path;
    }

    public void printGraph() {
       for (Vertex v : vertices)  {
           System.out.printf("%s ->", v.getValue());
           for (Object w : v.getNeighbours()) {
               System.out.printf(" %s", ((Vertex) w).getValue());
           }
           System.out.println();
       }
    }
}
