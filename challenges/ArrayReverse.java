class ArrayReverse {
  public static void main(String[] args) {
int[] array = {1, 2, 3, 4, 5, 6};
reverseArray(array);

  }
  static void reverseArray(int[] array ){
    for(int i =0;i<array.length;i++){
array [i] = array.length-i;
   System.out.println(array [i]);
}
  }
}
