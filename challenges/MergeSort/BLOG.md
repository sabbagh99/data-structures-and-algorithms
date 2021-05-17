# Merge Sort
###  Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
## Pseudocode
    ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

    ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

## Trace
### Visual
![Merge Sort](../assets/MergeSort.png)

### The input for our function is array with six elements in the step 1 and 2 we will split the array, and we will keep doing that using recursion until we get each element in separate array.
### In after we're done with  mergeSort method we will call the merge method to start checking the values and replace them in the correct order so in we can see in step 10,11,19,20 that we are sorted the arrays, and we will merge them in step 21,22 in one array to get the final result
