package stackAndQueue;

public class Queue {
  Node front;
  Node rear;

  public void enqueue(int value) {
    Node newNode = new Node(value);
    if (rear == null) {
      rear = newNode;
      front = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public int dequeue() {
    Node temp = null;
    if (front == null) {
      System.out.println(" front is null");
      return -1;
    } else {
      temp = front;

      front = temp.next;
      temp.next = null;
    }
    return temp.value;
  }

  public int peek() {
    if (front != null)
      return front.value;
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
