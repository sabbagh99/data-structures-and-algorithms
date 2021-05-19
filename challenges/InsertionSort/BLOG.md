# Insertion Sort
### Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
## Pseudocode

      InsertionSort(int[] arr)
      FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp

## Trace

### Sample Array: [8,4,23,42,16,15]

![image_1](../assets/InsertionSort.png)
#### 1st iteration : we are using while loop to check  if the 4 less than 8, and it's true we will switch the indexes for this two element then we will increase the j integer by one the check the second elements.
#### 2nd iteration : we will  check  if the 23 less than 8, and it's false we will not modify any this in this iteration
#### 3rd iteration : we are using while loop to check  if the 42 less than 23, and it's also false, and we will not modify anything in this iteration
#### 4th iteration : in this iteration we will check the 16 is less than the 42 and which is true, so we will go modify the array and make it the element of index 4 equal the  element of index 3
#### 5th iteration : and we will keep do the same until  the condition came false.

### Efficiency
* ####  Time: O(n^2) : because we are using while loop inside the for loop.
* ####  Space: O(1).


