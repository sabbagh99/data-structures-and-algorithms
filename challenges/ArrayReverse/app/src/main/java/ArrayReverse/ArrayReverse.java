package ArrayReverse;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
//    int[] array = {};
    int[] array = {5,13,80,-54,180};

    reverseArray(array);
  }
  static void reverseArray(int[] array ){
    int [] newArr = new int[array.length];
    int j = 0;
    for(int i=array.length-1;i>=0;i--){
      newArr[j]=array[i];
      j++;
    }
    System.out.println(Arrays.toString(newArr));
  }
}
