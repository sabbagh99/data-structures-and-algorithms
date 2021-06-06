package GetEdge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

  public T GetEdge1(Node from, Node to) {
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
//
//  public Set<Node> GetEdge(Node fromVertex , Node toVertex) {
//    List<Node> nodes = new ArrayList();
//    Queue breadth = new Queue();
//    Set<Node> visited = new HashSet<Node>();
//    Node front = null;
//
//    if (fromVertex.value == null)
//      return null;
//
//    breadth.enqueue(fromVertex);
//    visited.add(fromVertex);
//      while (!breadth.isEmpty()) {
//        if (visited.contains(toVertex)) {
//          break;
//        }
//          front = breadth.dequeue();
//        nodes.add(front);
//
//        List list = graph.children(front);
//        for (Object f : list) {
//          if (!visited.contains(f)) {
//            visited.add((Node) f);
//            breadth.enqueue(f);
//          }
//        }
//
//    }
//    return visited;
//  }
//
//
//  public int getEdge2() {
//
//    for(int k = 1; k <= n; k++){
//      for(int i = 1; i <= n; i++){
//        for(int j = 1; j <= n; j++){
//          dist[i][j] = min( dist[i][j], dist[i][k] + dist[k][j] );
//        }
//      }
//    }
//    return 1;
//  }
}
