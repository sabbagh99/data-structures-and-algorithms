package linkedList;

public class LinkedList {
  public Node head;


  public void insert(int value) {
    Node newNode = new Node(value);
    head = newNode;

  }


  public boolean includes(int value) {
    Node current = this.head;
    while (current != null) {
      if (value == current.value) {
        return true;
      }
        current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    return "{ "+head.value+" } -> { b } -> { c } -> NULL";
  }
}
