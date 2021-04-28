package utilities;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTree {
  public void FizzBuzzTree(){

  }
}
 class tree<T> {
  private Node<T> root;

  public tree(T value) {
    root = new Node<T>();
    root.value = value;
    root.children = new ArrayList<Node<T>>();
  }

  public static class Node<T> {
    private T value;
    private Node<T> parent;
    private List<Node<T>> children;
  }
}
