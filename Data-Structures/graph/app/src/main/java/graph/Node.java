package graph;

public class Node<T> {
  T value;
  T weight;
  T edge;

  public Node(T value, T weight, T edge) {
   this.value = value;
   this.weight= weight;
   this.edge = edge;
  }
}
