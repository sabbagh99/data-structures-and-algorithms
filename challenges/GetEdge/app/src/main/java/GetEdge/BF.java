package GetEdge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BF {
  Graph graph;

  public List<Node> graph() {
    graph = new Graph();
    Node A = graph.addNode("pandora");
    Node B = graph.addNode("arendelle");
    Node C = graph.addNode("metroville");
    Node D = graph.addNode("monstroplis");
    Node E = graph.addNode("naboo");
    Node F = graph.addNode("narnia");

    graph.addEdge(A, 4, B);
    graph.addEdge(B, 9, C);
    graph.addEdge(B, 3, D);
    graph.addEdge(C, 5, D);
    graph.addEdge(C, 6, F);
    graph.addEdge(C, 6, E);
    graph.addEdge(D, 6, E);
    graph.addEdge(E, 6, F);


    return BreadthFirst(A);

  }

  public List<Node> BreadthFirst(Node vertex) {
    List<Node> nodes = new ArrayList();
    Queue breadth = new Queue();
    Set<Node> visited = new HashSet<Node>();
    Node front = null;

    if (vertex.value == null)
      return null;

    breadth.enqueue(vertex);
    visited.add(vertex);

    while (!breadth.isEmpty()) {
      front = breadth.dequeue();
      nodes.add(front);

      List list = graph.children(front);
      for (Object f : list) {
        if (!visited.contains(f)) {
          visited.add((Node) f);
          breadth.enqueue(f);
        }
      }
    }
    return nodes;
  }
}
