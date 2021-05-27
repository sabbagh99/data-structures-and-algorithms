package graph;

public class Node<T> {
  T value;


  public Node(T value) {
   this.value = value;

  }

  @Override
  public String toString() {
    return
      "Node=" + value;
  }
}
