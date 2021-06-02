package GetEdge;

import java.util.List;


public class GetEdge<T> {
  Graph graph = new Graph();

  public void graph() {
    Node A = graph.addNode("pandora");
    Node B = graph.addNode("arendelle");
    Node C = graph.addNode("metroville");
    Node D = graph.addNode("monstroplis");
    Node E = graph.addNode("naboo");
    Node F = graph.addNode("narnia");

    graph.addEdge(A, 150, B);
    graph.addEdge(A, 82, C);
    graph.addEdge(B, 99, C);
    graph.addEdge(B, 42, D);
    graph.addEdge(C, 105, D);
    graph.addEdge(C, 37, F);
    graph.addEdge(C, 26, E);
    graph.addEdge(D, 37, E);
    graph.addEdge(E, 250, F);
    System.out.println(GetEdge(A, E));
  }

  public T GetEdge(Node from, Node to) {
    List<Edge> path = graph.getNeighbors(from);
    List<Edge> childPath = null;
    int cont = 0;
    for (int i = 0; i < path.size(); i++) {
      if (path.get(i).node2 == to) {
        return (T) path.get(i).weight;
      }
    }
    for (int j = 0; j < path.size(); j++) {

      childPath = graph.getNeighbors(path.get(j).node2);
    }
    for (int x = 0; x < childPath.size(); x++) {
      if (childPath.get(x).node2 == to) {


        return (T) childPath.get(x);
//           int w = (int) childPath.get(i).weight;
      }


    }
    return null;
  }
}
