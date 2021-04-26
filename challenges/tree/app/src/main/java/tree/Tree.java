package tree;

import java.util.ArrayList;

public class Tree {
  ArrayList<Integer> arr = new ArrayList<>();

  public ArrayList preOrder(Node root) {


    arr.add((Integer)root.value);
    if (root.left != null)
      preOrder(root.left);

    if (root.right != null)
      preOrder(root.right);
    return arr;
  }

  public ArrayList inOrder(Node root) {
    if (root.left != null) {
      inOrder(root.left);
    }

    arr.add((Integer)root.value);
    if (root.right != null)
      inOrder(root.right);
    return arr;
  }

  public ArrayList postOrder(Node root) {

    if (root.left != null) {
      postOrder(root.left);
    }

    if (root.right != null) {
      postOrder(root.right);
    }

    arr.add((Integer)root.value);
    return arr;
  }

}
