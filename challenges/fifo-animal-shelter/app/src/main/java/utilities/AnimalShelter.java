package utilities;

import fifo.animal.shelter.Node;

public class AnimalShelter {
  Node front;
  Node rear;

  public void enqueue(Object value) {
    Node newNode = new Node(value);
    if (rear == null) {
      rear = newNode;
      front = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public Object dequeue() {
    Node temp = null;
    if (front == null) {
      return "front is null";
    } else {
      temp = front;
      front = temp.next;
      temp.next = null;
    }
    return temp.value;
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
