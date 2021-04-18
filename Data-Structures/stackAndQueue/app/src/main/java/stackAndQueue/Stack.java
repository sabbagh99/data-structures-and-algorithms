package stackAndQueue;

public class Stack {
  Node top;

  public void push(int value) {
    Node newNode = new Node(value);
    if (top == null) {
      this.top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  public int pop() {
    Node newTop = top;
    try {
      top = top.next;
      newTop.next = null;
    } catch (Exception e) {
      System.out.println(e);
      return -1;
    }
    return newTop.value;


  }

  public int peek() {
    try {
      return top.value;
    } catch (Exception e) {
      System.out.println(e);
    }
    return -1;
  }

  public boolean isEmpty() {
    if (top == null)
      return true;
    return false;
  }

  @Override
  public String toString() {
    String value = "";
    Node current = top;
    while (current != null) {
      value += "{" + current.value + "}";
      current =current.next;
    }
    return value;
  }
}
