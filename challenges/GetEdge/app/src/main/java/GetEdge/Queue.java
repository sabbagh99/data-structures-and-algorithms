package GetEdge;

public class Queue<T> {
  Node front;
  Node rear;

  public void enqueue(T value) {
    Node newNode = new Node(value);
    if (front == null) {
      rear = newNode;
      front = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public Node dequeue() {
    Node temp = null;
    if (front == null) {
      System.out.println(" front is null");
      return null;
    } else {
      temp = front;

      front = temp.next;
      temp.next = null;
    }
    return temp;
  }

  public int peek() {
    if (front != null)
      return (int)front.value;
    return -1;
  }

  public boolean isEmpty() {
    if (front == null) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    Node curr = front;
    String values = "";
    while (curr != null) {
      values += "{" + curr.value + "}";
      curr = curr.next;
    }
    return values;
  }
}
