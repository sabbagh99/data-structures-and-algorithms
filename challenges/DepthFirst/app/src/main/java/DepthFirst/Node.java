package DepthFirst;

public class Node<T> {
  T value;
  Node next;


  public Node(T value) {
    this.value = value;

  }
//
//  public Node(String value){
//    this.value=(T)value;
//
//  }
//
//  public Node(T value){
//    this.value=(T)value;
//
//  }
  public Node() {
  }

  @Override
  public String toString() {
    return ""+value;
  }
}
