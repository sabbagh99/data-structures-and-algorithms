package tree;

public class Node<T> {

  public T value;
  Node left;
  Node right;

  public Node(T value) {
    this.value = value;
    left = null;
    right = null;
  }

  @Override
  public String toString() {
    return "" + value;
  }
}
