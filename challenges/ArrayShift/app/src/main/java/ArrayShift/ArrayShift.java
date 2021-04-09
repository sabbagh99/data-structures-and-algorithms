package ArrayShift;

import java.util.Arrays;

public class ArrayShift {
  static int[] insertShiftArray(int[] array,int num){
    int [] newArr = new  int[array.length+1];
    int middle = array.length;
    if(middle%2==0){
      middle = (array.length/2);
    }else{
      middle = (array.length/2)+1;
    }
    for(int i=0;i<middle;i++){
      newArr[i] = array[i];
    }
    newArr[middle]= num;
    for (int i=(middle+1);i<array.length+1;i++){
      newArr[i] = array[i-1];
    }
    return newArr;
  }
  public static void main(String[] args) {
  }
}
