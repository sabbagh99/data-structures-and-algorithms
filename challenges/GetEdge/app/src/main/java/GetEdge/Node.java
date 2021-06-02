package GetEdge;


public class Node<T> {
  T value;
  Node next;


  public Node(T value) {
    this.value = value;

  }

  public Node() {
  }

  @Override
  public String toString() {
    return "" + value;
  }
}
