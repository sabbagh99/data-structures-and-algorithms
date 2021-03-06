/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ArrayShift;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {
  //    @Test public void testAppHasAGreeting() {
//        ArrayShift classUnderTest = new ArrayShift();
//        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
//    }
  @Test
  public void textInsertShiftArray() {
    ArrayShift classUnderTest = new ArrayShift();
    int[] oddArray = {4, 8, 15, 23, 42};
    int[] oddExpected = {4, 8, 15, 16, 23, 42};
    int[] evenArray = {2,4,6,8};
    int[] evenExpected = {2,4,5,6,8};
    int[] emptyArr = {};
    int[] emptyExpected = {7};
    assertEquals("for the odd array length", Arrays.toString(oddExpected), Arrays.toString(classUnderTest.insertShiftArray(oddArray, 16)));
    assertEquals("for the even array length", Arrays.toString(evenExpected), Arrays.toString(classUnderTest.insertShiftArray(evenArray, 5)));
    assertEquals("for the empty array length", Arrays.toString(emptyExpected), Arrays.toString(classUnderTest.insertShiftArray(emptyArr, 7)));

  }
}
