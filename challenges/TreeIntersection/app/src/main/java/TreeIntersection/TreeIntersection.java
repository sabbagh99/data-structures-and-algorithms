package TreeIntersection;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {

  Hashtable table = new Hashtable();
  Node root;
  Node currentRoot;
  Node parentRoot;
  List valuesArr = new ArrayList();





  public List commonValues(Node root1,Node root2){

    if(root1==null||root2==null)
      return null;

    traversal(root1);
    traversal(root2);

return valuesArr;
  }


  public List traversal(Node root) {


    if (root.left != null) {
      traversal(root.left);
    }
    int idx = index ((T)root);
    if(table.arr[idx]==null) {
      table.add(root.value,root.value);
    }else{

      valuesArr.add((int)root.value);

    }
    if (root.right != null)
      traversal(root.right);
    return valuesArr;
  }




  public void add(T key) {
    if (root == null) {
      root = new Node(key);
      return;
    } else {
      currentRoot = root;
      while (root != null) {
        parentRoot = currentRoot;
        if ((Integer) key < (Integer) currentRoot.value) {
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




  public int index (T key){
    int idx = table.hash(key);
    return idx;
  }
}
