package src.com.javatraining.tasks.week06.task_100020.SimpleGraphLib;

import java.util.List;

public class Main {
    public static void main(String [] args){

        UnDirectedGraph graph = new UnDirectedGraph();
        Vertex<String> v1 = new Vertex("1");
        Vertex<String> v2 = new Vertex("2");
        Vertex<String> v3 = new Vertex("3");
        Vertex<String> v4 = new Vertex("4");
        Vertex<String> v5 = new Vertex("5");
        Vertex<String> v6 = new Vertex("6");

        graph.addEdge(v1,v2);
        graph.addEdge(v5,v1);
        graph.addEdge(v1,v3);
        graph.addEdge(v2,v5);
        graph.addEdge(v3,v4);
        graph.addEdge(v4,v5);
        graph.addEdge(v4,v6);

        List<Vertex> path = graph.getPath(new Vertex("1"), new Vertex("6"));

        if (path == null){
            System.out.println("No path..");
        }else {
            for (Vertex edge : path) {
                System.out.println(edge.getValue());
            }
        }
    }
}
