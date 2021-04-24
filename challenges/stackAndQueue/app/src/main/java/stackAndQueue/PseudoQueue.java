package stackAndQueue;

public class PseudoQueue {
  Stack stackOne = new Stack();
  Stack stackTwo = new Stack();

  public void enqueue(int value) {
    stackOne.push(value);
  }

  public void dequeue() {
    if (stackTwo.isEmpty())
      while (!stackOne.isEmpty()) {
        stackTwo.push(stackOne.pop());
      }
    stackTwo.pop();
  }

  @Override
  public String toString() {
    return "PseudoQueue{" +
      "stackOne=" + stackOne +
      ", stackTwo=" + stackTwo +
      '}';
  }
}
