package tree;

public class BiinarySearchTree<T> {
  Node root;
  Node currentRoot;
  Node parentRoot;

  public void add(T key) {
    if (root == null) {
      root = new Node(key);
      return;
    } else {
      currentRoot = root;
      while (root != null) {
        parentRoot = currentRoot;
        if ( (Integer)key < (Integer)currentRoot.value) {
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


  public boolean contains(T value) {
    Node currentRoot = root;
    if (root == null) {
      return false;
    } else {
      while (currentRoot.value != value) {

        if ((Integer)value < (Integer)currentRoot.value) {
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
public Integer findMaximumValue(Node root){
    if (root == null)
      return null;
    else {
      while (root.right != null)
        root = root.right;
    }
  return ((Integer)root.value);
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
