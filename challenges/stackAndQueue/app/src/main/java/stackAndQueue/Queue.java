package stackAndQueue;

public class Queue<T> {
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

  public T dequeue() {
    Node temp = null;
    if (front == null) {
      return null;
    } else {
      temp = front;

      front = temp.next;
      temp.next = null;
    }
    return (T) temp.value;
  }

  public T peek() {
    if (front != null)
      return (T)front.value;
    return null;
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
