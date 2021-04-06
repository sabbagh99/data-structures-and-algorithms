import java.util.Arrays;

public class test {
  static void BinarySearch(int[] arr,int key){
    Arrays.sort(arr);
    int a,b,c;
    a=0;
    c=(arr.length)-1;
    while(a<=c){
      b=(a+c)/2;
      if(key==arr[b]){
        System.out.println(b);
        break;
      }else if (key>arr[b]){
        a=b+1;
      }else if (key<arr[b]){
        c=b-1;
      }

    }
  }
  public static void main(String[] args) {
    int [] array = {2,4,3,12,7,11,9,8,5};
    BinarySearch(array,12);
  }
}
