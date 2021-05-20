package hashtable;

import static java.lang.Integer.parseInt;

public class Hashtable<T> {

  public void add (String key , T value ){
    int [] arr = new int[10000];
    int k = key.length();
    int sum = 0;
    for(int i = 0 ; i < k-1 ; i++){
      sum += key.charAt(i);
    }
    int idx = sum% 99;
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
