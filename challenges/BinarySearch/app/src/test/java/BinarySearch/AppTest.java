/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void testBinarySearch() {
    BinarySearch classUnderTest = new BinarySearch();
    int[] array = {2, 4, 3, 12, 7, 11, 9, 8, 5};

    assertEquals(3, classUnderTest.BinarySearch(array, 5));
    assertEquals(-1, classUnderTest.BinarySearch(array, 33));

  }
}