package utilities;

import stackAndQueue.Node;

public class AnimalShelter<T> {
  Node front;
  Node rear;

  public void enqueue(T value) {
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

  @Override
  public String toString() {
    Node curr = front;
    String values = "";
    while (curr != null) {
      values +=   curr.value ;
      curr = curr.next;
    }
    return values;

  }
}
