package hashtable;

import static java.lang.Integer.parseInt;

public class Hashtable<T> {

  public void add (String key , T value ){
    int [] arr = new int[100];
    int idx = parseInt(key) % 55;
    System.out.println(idx);
    arr[idx]= (Integer)value;
    System.out.println(arr[idx]);

  }

  public void get(String key){
    int idx = parseInt(key) % 55;


  }

  public boolean  contains(String key){
    int idx = parseInt(key) % 55;


  return false;
  }
}
