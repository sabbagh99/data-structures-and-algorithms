package linkedList;

public class LinkedList {
  public Node head;

  public String test() {
    Node testNode = head.next;
    return " your Nodes is" + testNode;
  }



  public int insert(int value) {
    try {
      Node current = head;
      head = new Node(value);
      if( current != null){
        head.next =current;
      }

    }catch (Exception e){
      System.out.println("problem in insert method");
    }
    return head.value;
  }

  public boolean includes(int value) {
    Node current = head;
    try {
      while (current != null) {
        if (value == current.value) {
          return true;
        }
        current = current.next;
      }
    } catch (Exception e) {
      System.out.println("problem in include method");
    }
    return false;
  }

  public String toString() {
    String string = "";
    Node current = head;
    while (current != null) {
      string += "{" + current.value + "}->";
      current = current.next;
    }
    if (head != null) {
      string += "NULL";
    }

    return string;
  }
}
