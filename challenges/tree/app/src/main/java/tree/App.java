/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import utilities.FizzBuzzTree;
import utilities.k_aryTree;

public class App {

  public static void main(String[] args) throws InterruptedException {
//    BiinarySearchTree biinarySearchTree = new BiinarySearchTree();
//    Tree tree = new Tree();
//    System.out.println(biinarySearchTree);
//    System.out.println(tree);
//    biinarySearchTree.add(5);
//    biinarySearchTree.add(3);
//    biinarySearchTree.add(7);
//    biinarySearchTree.add(1);
//    biinarySearchTree.add(9);
//    System.out.println(biinarySearchTree.findMaximumValue(biinarySearchTree.root));
//    System.out.println(biinarySearchTree.contains(50));
//    System.out.println(tree.inOrder(biinarySearchTree.root));
//    tree.arr.clear();
//
//    System.out.println(tree.preOrder(biinarySearchTree.root));
//    tree.arr.clear();
//
//    System.out.println(tree.postOrder(biinarySearchTree.root));

//    System.out.println(biinarySearchTree.breadthFirst(biinarySearchTree.root));
//    k_aryTree root = new k_aryTree(1);
//    FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
//    root.children.add(new k_aryTree(2));
//    root.children.add(new k_aryTree(3));
//    root.children.add(new k_aryTree(4));
//    root.children.add(new k_aryTree(5));
//    root.children.add(new k_aryTree(6));
//    root.children.add(new k_aryTree(7));
//    root.children.add(new k_aryTree(8));
//    root.children.add(new k_aryTree(9));
//    root.children.add(new k_aryTree(15));
//    System.out.println(fizzBuzzTree.FizzBuzzTree(root));



    BinaryTree binaryTree = new BinaryTree();
    binaryTree.root = new Node(1);
    binaryTree.root.left = new Node(7);
    binaryTree.root.right = new Node(-5);
    binaryTree.root.left.left = new Node(4);
    System.out.println(binaryTree.traverseTree(binaryTree.root));


  }
}
