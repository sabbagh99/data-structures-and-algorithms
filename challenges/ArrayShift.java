import java.util.*;
class ArrayShift {
  static int[] insertShiftArray(int[] array,int num){
    int middle = array.length/2;
    for(int i=0;i<array.length;i++){
      array[middle] = num;

    }
    return array;
  }
  public static void main(String[] args) {
    int[] array = {5,5,6,8,7};
    System.out.println(Arrays.toString(insertShiftArray(array,4)));
  }
}
