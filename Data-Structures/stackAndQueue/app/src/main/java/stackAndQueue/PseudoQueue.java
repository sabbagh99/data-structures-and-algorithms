package stackAndQueue;

public class PseudoQueue {

  Stack stackOne = new Stack();
  Stack stackTwo = new Stack();

  public void enqueue(int value) {

   while(!stackOne.isEmpty()){ // keep looping while stackOne is not empty
     stackTwo.push(stackOne.pop()); // push all values for stackOne inside stackTwo
   }
   stackOne.push(value);// push your value in stackOne
   while(!stackTwo.isEmpty()){ // keep looping while stackTwo is not empty
     stackOne.push(stackTwo.pop()); // get back your value from stackTwo
   }

  }

public int dequeue(){

  while(!stackOne.isEmpty())
    stackTwo.push(stackOne.pop());
  return stackTwo.pop();
}

  @Override
  public String toString() {
    String values = "";
    while (!stackOne.isEmpty()){
      values += "{" + stackOne.pop() + "}";
    }
    return values;
  }
}
