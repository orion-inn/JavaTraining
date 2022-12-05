package com.javatraining.tasks.SimpleGraphLib;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class UnDirectedGraphTest {

    private static UnDirectedGraph<String> graph;

    @BeforeAll
    static void setup() {
        graph = new UnDirectedGraph<>();

        Vertex<String> v1 = new Vertex<>("1");
        Vertex<String> v2 = new Vertex<>("2");
        Vertex<String> v3 = new Vertex<>("3");
        Vertex<String> v4 = new Vertex<>("4");
        Vertex<String> v5 = new Vertex<>("5");
        Vertex<String> v6 = new Vertex<>("6");

        graph.addEdge(v1, v2);
        graph.addEdge(v5, v1);
        graph.addEdge(v2, v5);
        graph.addEdge(v3, v4);
        graph.addEdge(v4, v6);
    }

    @Test
    @DisplayName("The path from 1 to 5 should exist")
    void pathShouldExist() {
        List<Vertex<String>> path = graph.getPath(new Vertex<>("1"), new Vertex<>("5"));
        assertNotNull(path);
    }

    @Test
    @DisplayName("The path from 1 to 6 should not exist")
    void pathShouldNotExist() {
        List<Vertex<String>> path = graph.getPath(new Vertex<>("1"), new Vertex<>("6"));
        assertNull(path);
    }

}