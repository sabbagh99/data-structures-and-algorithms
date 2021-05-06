# Trees

### Trees is a type of data structure and  we have many types of tree in this code challenge we are dealing with binary tree.

## Challenge

### In this challenge what is required is learn how we can traversal in a tree and adding elements.

## Approach & Efficiency

### In this  code challenge most method using recursion the Big(O) for the time is O(log n).

## API

### Here is description for each method in this code challenge :

* #### `preOrder:` to traversal in the tree by following this approach *root >> left >> right*
* #### `inOrder:`to traversal in the tree by following this approach *left >> root >> right*
* #### `postOrder:`to traversal in the tree by following this approach *left >> right >> root*
* #### `add:` this method to add take integer as  input and add it in the correct location in the tree
* #### `contain:` for checking if the provided value exist in the tree or not.




# Code challenge 16 (find maximum value)
### we have tree contain values, and we need to  traversal in this array and  return the max value on it.

## Challenge Description
### In this challenge we need to deal with binary tree by traversal in this array and get the max value.

## Approach & Efficiency
### We just have one method for this challenge which is `traverseTree` this method take node as argument and it's using recursion and returning the maximum value.
## Solution
![whiteboard](../assets/maxValue.jpeg)


# Code challenge 17 (breadth first )
### we have tree contain values, and we need to  traversal in this array using breadth method.

## Challenge Description
### We will  write a breadth first traversal method which takes a Binary Tree as its unique input.
## Approach & Efficiency
### We just have one method for this challenge which is `breadthFirst` this method take node as argument and start looping through the tree and save each value of it inside array and return it .
## Solution
![whiteboard](../assets/breadthFirst.jpeg)


# Code Challenge: Class 18
### know how to implement k-tree and add more than two  children  foo each node.
## Challenge Description
### Determine whether the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, and if the node value divisible by  3 we will add fizz and if it divisible by 5 we will add buzz and if divisible by both we will add fizzbuzz.

## Approach & Efficiency
### 1.implement a K-tree.
### 2.add values tree
### 3.traversal through the tree
### 4.check each node value if  divisible by 3,5 or both and replace it with the requierd value.
### 5.return the new tree
### Big(O):
 #### *time complexity =O(n) where n length of tree
#### *space complexity = O(w) where w the maximum number of node can the queue hold
## Solution
 ![whiteboard](../assets/k-tree.jpeg)