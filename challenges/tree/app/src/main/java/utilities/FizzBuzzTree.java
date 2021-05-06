package utilities;

import java.util.LinkedList;
import java.util.Queue;

public class FizzBuzzTree<T> {


  public String FizzBuzzTree(k_aryTree root) {
    String fizzBuzz="";

    if (root == null) return null;
    Queue<k_aryTree> queue = new LinkedList<>();

      queue.offer(root);

    while (!queue.isEmpty()) {
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        k_aryTree node = queue.poll();
        assert node != null;
        if ((int)node.value % 15==0){
          fizzBuzz += "FizzBuzz ";
        }
        else if ((int)node.value%5==0){
          fizzBuzz += "buzz ";
        }
        else if ((int)node.value%3==0){
          fizzBuzz +="Fizz ";
        }else {
          fizzBuzz += node.value + " ";
        }
//        System.out.print(node.value + " ");
        for (Object item : node.children) {
          queue.offer((k_aryTree) item);
        }
      }
    }
return  fizzBuzz;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
