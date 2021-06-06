package GetEdge;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {

  List<Node> nodes = new ArrayList();
  List<Edge> edges = new ArrayList();

  public Node addNode(T value) {
    Node newNode = new Node(value);
    nodes.add(newNode);
    return newNode;
  }

  public Edge addEdge(Node node1, int weight, Node node2) {

    Edge newEdge = new Edge(node1, weight, node2);
    edges.add(newEdge);
    return newEdge;
  }

  public List<Node> getNodes() {
    return nodes;
  }

  public List<Edge> getNeighbors(Node node) {
    List neighbors = new ArrayList();
    for (int i = 0; i < edges.size(); i++) {

      if (edges.get(i).node1.value == node.value) {
        Edge newEdge = new Edge(edges.get(i).node1  , edges.get(i).weight, edges.get(i).node2);
        neighbors.add(newEdge);

      }
    }

    return neighbors;
  }

  public int size() {
    return nodes.size();
  }

  public List<Node> children(Node node) {
    List children = new ArrayList();

    for (int i = 0; i < edges.size(); i++) {
      Edge getNode1 = edges.get(i);
      Node temp2 = (Node) node.value;

      Node temp1 = getNode1.node1;
      if (temp1 == temp2) {
        Node temp = edges.get(i).node2;
        children.add(temp);
      }
    }
    return children;
  }

  @Override
  public String toString() {
    if (size() == 0)
      return null;
    return "Graph{" +
      "nodes=" + nodes +
      ", edges=" + edges +
      '}';

  }
}
