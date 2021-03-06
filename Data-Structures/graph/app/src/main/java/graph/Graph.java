package graph;

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

  public String getNeighbors(Node node) {
String neighbors = "";
for (int i=0; i<edges.size();i++){

if( edges.get(i).node1.value == node.value){
    neighbors+= "\n " + edges.get(i).node1.value +"-->"+ edges.get(i).node2.value +", weight = " +edges.get(i).weight ;
}else {return null;}
}

    return neighbors;
  }

  public int size() {
    return nodes.size();
  }

  @Override
  public String toString() {
    if(size() == 0)
      return null;
      return "Graph{" +
        "nodes=" + nodes +
        ", edges=" + edges +
        '}';

  }
}
