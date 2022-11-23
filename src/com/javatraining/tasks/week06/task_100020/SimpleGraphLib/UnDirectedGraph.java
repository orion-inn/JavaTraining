package src.com.javatraining.tasks.week06.task_100020.SimpleGraphLib;

public class UnDirectedGraph extends DirectedGraph {

    @Override
    public void addEdge(Vertex from, Vertex to) {
        super.addEdge(from, to);
        addVertex(to);
        to.addNeighbour(from);
    }
}
