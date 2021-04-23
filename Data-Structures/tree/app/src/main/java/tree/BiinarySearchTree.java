package tree;

public class BiinarySearchTree {
  Node root;
  Node currentRoot;
  Node parentRoot;

  public void add(int key) {
    if (root == null) {
      root = new Node(key);
      return;
    } else {
      currentRoot = root;
      while (root != null) {
        parentRoot = currentRoot;
        if (key < currentRoot.value) {
          currentRoot = currentRoot.left;
          if (currentRoot == null) {
            parentRoot.left = new Node(key);
            return;
          }
        } else {
          currentRoot = currentRoot.right;
          if (currentRoot == null) {
            parentRoot.right = new Node(key);
            return;
          }
        }
      }
    }
  }


  public boolean contains(int value) {
    Node currentRoot = root;
    if (root == null) {
      return false;
    } else {
      while (currentRoot.value != value) {

        if (value < currentRoot.value) {
          currentRoot = currentRoot.left;

        } else {

          currentRoot = currentRoot.right;
        }

        if (currentRoot == null)
          return false;
      }
      return true;
    }


  }

  @Override
  public String toString() {
    return "BiinarySearchTree{" +
      "root=" + root +
      ", currentRoot=" + currentRoot +
      ", parentRoot=" + parentRoot +
      '}';
  }
}
