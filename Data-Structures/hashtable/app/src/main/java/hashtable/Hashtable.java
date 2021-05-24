package hashtable;

import java.util.Arrays;

public class Hashtable <T>{

  Bucket[] arr = new Bucket[10000];

  public void add(T key, T value) {
    Bucket newBucket = new Bucket(key, value);
    Bucket temp = null;
    int idx = hash(key);
    if (arr[idx] == null) {
      arr[idx] = newBucket;
    }
    else {
      temp =  arr[idx];
      arr[idx] = newBucket;
      arr[idx].next = temp;
    }
  }

  public Object get(T key) {
    int idx = hash(key);
    if (arr[idx] != null) {
      Bucket temp = arr[idx];

      while( !temp.key.equals(key)
        && temp.next != null ) {
        temp = temp.next;
      }
      return temp.value;
    }

    return null;

  }

  public boolean contains(T key) {
    int idx = hash(key);
    if (arr[idx] != null) {
      Bucket temp = arr[idx];
      if (temp.key == key)
        return true;

    }

    return false;
  }

  public int hash(T key) {

    int k = key.toString()
               .length();
    int sum = 0;
    for (int i = 0; i <= k - 1; i++) {
      sum += key.toString()
                .charAt(i);
    }
    int idx = (sum * 599) % 1024;

    return idx;
  }

  @Override
  public String toString() {
    return "Hashtable{" +
      "arr=" + Arrays.toString(arr) +
      '}';
  }
}
