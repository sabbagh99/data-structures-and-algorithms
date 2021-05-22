package QuickSort;

public class QuickSort {

  public int[] QuickSort(int[] arr, int left,  int right) {
    if (left < right) {
      // Partition the array by setting the position of the pivot value
      int position = Partition(arr, left, right);
      // Sort the left
      QuickSort(arr, left, position - 1);
      // Sort the right
      QuickSort(arr, position + 1, right);

    }
    return arr;
  }
    public int Partition (int[] arr, int left,  int right) {
      // set a pivot value as a point of reference
      int pivot =arr[right];
      // create a variable to track the largest index of numbers lower than the defined pivot
      int low =left - 1;
      for (int i=left; i <= right-1;i++){
        if (arr[i] <= pivot) {
          low++;
          Swap(arr, i, low);
        }
      }
      // place the value of the pivot location in the middle.
      // all numbers smaller than the pivot are on the left, larger on the right.
      Swap(arr, right, low + 1);
      // return the pivot index point
      return low + 1;
    }
  public void Swap( int []arr, int i, int low) {
    int temp;
    temp=arr[i];
    arr[i] =arr[low];
    arr[low] =temp;
  }
}
