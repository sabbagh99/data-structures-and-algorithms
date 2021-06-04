package DepthFirst;

import java.util.ArrayList;
import java.util.List;

public class DepthFirst<T> {


  public void graph() {
    Graph graph = new Graph();

    Node A = graph.addNode("a");
    Node B = graph.addNode("b");
    Node C = graph.addNode("c");
    Node D = graph.addNode("d");
    Node E = graph.addNode("e");
    Node H = graph.addNode("h");
    Node F = graph.addNode("f");
    Node G = graph.addNode("g");


    graph.addEdge(A, 9, B);
    graph.addEdge(A, 4, D);
    graph.addEdge(B, 5, D);
    graph.addEdge(B, 3, C);
    graph.addEdge(C, 6, G);
    graph.addEdge(D, 6, E);
    graph.addEdge(D, 6, H);
    graph.addEdge(D, 6, F);
    graph.addEdge(H, 6, F);


    System.out.println(traversal(graph, A));

  }


  public List traversal(Graph graph, Node root) {

    List<Node> visited = new ArrayList<>();
    Stack stack = new Stack();
    stack.push((root));
    while (!stack.isEmpty()) {
      Node val = stack.pop();
      if (!visited.contains(val)) {
        visited.add((Node) val);

        for (Object v : graph.children(val)) {
          stack.push(v);

        }
      }
      }
//    A, B, C, G, D, E, H, F
      return visited;
    }
  }
