/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testApp() {
    Tree tree = new Tree();
    BiinarySearchTree binarySearchTree = new BiinarySearchTree();
    assertEquals("BiinarySearchTree{root=null, currentRoot=null, parentRoot=null}", binarySearchTree.toString());//Can successfully instantiate an empty tree

    assertTrue(binarySearchTree.findMaximumValue(binarySearchTree.root)==null); // testing the max value for the binary search tree when i'ts empty
    binarySearchTree.add(5);
    assertEquals("BiinarySearchTree{root=5, currentRoot=null, parentRoot=null}", binarySearchTree.toString());//Can successfully instantiate a tree with a single root node
    binarySearchTree.add(3);
    binarySearchTree.add(7);

    assertEquals("[5, 3, 7]", tree.preOrder(binarySearchTree.root)
                                  .toString());//Can successfully add a left child and right child to a single root node
    tree.arr.clear();
    binarySearchTree.add(1);
    binarySearchTree.add(9);
    assertEquals("[1, 3, 5, 7, 9]", tree.inOrder(binarySearchTree.root)
                                        .toString());//Can successfully return a collection from an inorder traversal

    tree.arr.clear();
    assertEquals("[5, 3, 1, 7, 9]", tree.preOrder(binarySearchTree.root)
                                        .toString());//Can successfully return a collection from a preorder traversal

    tree.arr.clear();
    assertEquals("[1, 3, 9, 7, 5]", tree.postOrder(binarySearchTree.root)
                                        .toString());//Can successfully return a collection from a postorder traversal
    assertTrue(binarySearchTree.findMaximumValue(binarySearchTree.root)==9);// testing the max value for the binary search tree


  }


  @Test
  public void testBreadthFirst() throws InterruptedException {
    BiinarySearchTree biinarySearchTree = new BiinarySearchTree();

    assertEquals(null, biinarySearchTree.breadthFirst(biinarySearchTree.root));

    biinarySearchTree.add(5);

    assertEquals("[5]", biinarySearchTree.breadthFirst(biinarySearchTree.root)
                                                     .toString());
    biinarySearchTree.add(3);
    biinarySearchTree.add(7);
    biinarySearchTree.add(1);
    biinarySearchTree.add(9);
    assertEquals("[5, 3, 7, 1, 9]", biinarySearchTree.breadthFirst(biinarySearchTree.root)
                                                     .toString());



  }

  @Test
  public void testbinarySearchTree(){ // testing the max value for the binary  tree
    BiinarySearch binarySearch = new BiinarySearch();
    assertEquals(0,binarySearch.traverseTree(binarySearch.root));
    binarySearch.root = new Node(1);
    assertEquals(1,binarySearch.traverseTree(binarySearch.root));
    binarySearch.root.left = new Node(7);
    binarySearch.root.right = new Node(-5);
    assertEquals(7,binarySearch.traverseTree(binarySearch.root));
    binarySearch.root.left.left = new Node(10);
    assertTrue(binarySearch.traverseTree(binarySearch.root)==10);
  }

}
