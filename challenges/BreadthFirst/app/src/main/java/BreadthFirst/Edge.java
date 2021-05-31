package BreadthFirst;

public class Edge<T> {
  Node node1;
  Node node2;
  T weight;
  public Edge(Node node1,T weight ,Node node2){
    this.weight= weight;
    this.node1=node1;
    this.node2 = node2;

  }

//  @Override
//  public String toString() {
//    return "Edge between " + node1 +
//      "--> "+node2 +
//      ", weight=" + weight
//      ;
//  }
}
