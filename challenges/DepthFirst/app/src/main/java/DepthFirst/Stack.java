package DepthFirst;


public class Stack <T>{
  Node top;

  public void push(T value) {
    Node newNode = new Node(value);
    if (top == null) {
      this.top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  public Node pop() {
    Node newTop = top;
    try {
      top = top.next;
      newTop.next = null;
    } catch (Exception e) {
      System.out.println(e);
      return null;
    }
    return  newTop;


  }

  public Node peek() {
    try {
      return top;
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  public boolean isEmpty() {
    if (top == null)
      return true;
    return false;
  }
}
