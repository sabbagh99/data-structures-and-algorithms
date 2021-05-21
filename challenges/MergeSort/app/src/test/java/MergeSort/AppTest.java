/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MergeSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AppTest {
  @Test
  public void testMergeSort() {

    MergeSort mergeSort = new MergeSort();
    int[] arr = {};
    assertEquals("[]", Arrays.toString(mergeSort.mergesort(arr)));
    int[] arr1 = {5, 5, 5, 5, 5};
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(mergeSort.mergesort(arr1)));
    int[] arr2 = {8,4,23,42,16,15};
    assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(mergeSort.mergesort(arr2)));
  }
}
