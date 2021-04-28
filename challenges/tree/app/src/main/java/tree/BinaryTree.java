package tree;

public class BinaryTree<T> {

  Node root;
  int max = 0;
  public int traverseTree(Node root) {
    if (root != null) {
      traverseTree(root.left);
      if((int)root.value > max)
     max = (int)root.value;

      traverseTree(root.right);
    }
    return max;
  }
}
