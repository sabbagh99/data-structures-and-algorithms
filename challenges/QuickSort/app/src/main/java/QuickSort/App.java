/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package QuickSort;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    QuickSort quickSort = new QuickSort();
    int[] arr = { 8,4,23,42,16,15 };
    System.out.println(
      Arrays.toString(quickSort.QuickSort(arr,0,arr.length-1)));
  }
}
