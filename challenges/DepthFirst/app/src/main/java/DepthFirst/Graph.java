package DepthFirst;

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

  public List<Node> getNeighbors(Node node) {
    List<Node> neighbors = new ArrayList<>();
    for (int i = 0; i < edges.size(); i++) {
Object node1 = edges.get(i).node1.value;
Object node2 = node.value;
      if (node1 == node2) {
        neighbors.add(edges.get(i).node2);
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

      if (getNode1.node1 == node.value) {
        children.add(edges.get(i).node2);
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
