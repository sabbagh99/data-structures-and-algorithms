package utilities;

import java.util.LinkedList;
import java.util.List;

public class k_aryTree<T> {
  T value;
  public List<k_aryTree> children = new LinkedList<>();

  public k_aryTree(T value) {
    this.value = value;
  }

  public k_aryTree(T value, List<k_aryTree> child) {
    this.value = value;
    children = child;
  }
}
