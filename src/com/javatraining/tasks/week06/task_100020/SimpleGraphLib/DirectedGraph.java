package src.com.javatraining.tasks.week06.task_100020.SimpleGraphLib;

import java.util.ArrayList;
import java.util.List;

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
        int indexFrom = vertices.indexOf(from);

        if (indexFrom == - 1) {
            addVertex(from);
            indexFrom = vertices.size() - 1;
        }

        List<Vertex> neighbours = vertices.get(indexFrom).getNeighbours();
        int indexTo = neighbours.indexOf(to);

        if (indexTo == -1) {
            neighbours.add(to);
        }
    }

    @Override
    public List<Vertex> getPath(Vertex from, Vertex to) {
        return null;
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
