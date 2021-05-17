package MergeSort;

public class MergeSort {


  public int[] mergesort(int[] arr) {


  int n = arr.length;

    if( n >1) {
      int mid=n / 2;
      int[] left = new int[mid];
      int[] right = new int[n-mid];

      for (int i = 0; i < left.length; i++)
        left[i] = arr[i];
      for (int j = 0; j < right.length; j++)
        right[j] = arr[mid + j];


      // sort the left side
      mergesort(left);

      // sort the right side
      mergesort(right);

      // merge the sorted left and right sides together
      merge(left, right, arr);
    }
    return arr;
}
  public void merge(int []left, int []right, int []arr) {
    int i =0;
    int j =0;
    int k =0;

    while (i<left.length &&j<right.length) {
      if (left[i] <= right[j]) {
        arr[k] =left[i];
        i=i + 1;
      } else {
        arr[k] =right[j];
        j=j + 1;
      }
      k=k + 1;

      if (i == left.length)
        arr[k] = right[j];
            else
              arr[k] = left[i];
    }
  }
}
