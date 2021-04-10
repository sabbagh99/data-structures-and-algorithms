package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
  public String getGreeting() {
    return "Hello World!";
  }

  static int BinarySearch(int[] arr, int key) {
    Arrays.sort(arr);
    int a, b, c, e;
    a = 0;
    c = (arr.length) - 1;
    e = 0;
    b=0;
    while (a <= c) {
      b = (a + c) / 2;
      if (key == arr[b]) {
        e = b;
        break;
      } else if (key > arr[b]) {
        a = b + 1;
      } else if (key < arr[b]) {
        c = b - 1;
      }

    }
    if (b == e) {
      return e;
    }
    return -1;
  }

  public static void main(String[] args) {
  }
}
