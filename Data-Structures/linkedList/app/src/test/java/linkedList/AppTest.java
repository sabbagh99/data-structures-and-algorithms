/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testInsert() {
    LinkedList list = new LinkedList();
    assertEquals("", list.toString());
    list.insert(2);
    assertEquals(2, list.kthFromEnd(0)); //Where the linked list is of a size 1

    list.insert(3);
    assertEquals("{3}->{2}->NULL", list.toString());
    assertEquals(4, list.insert(4));
// -------------- testIncludes------------------
    list.insert(5);
    list.includes(6);
    assertTrue(list.includes(5));
    assertFalse(list.includes(9));

    //------------------------------------------------------------------- Linked list part two --------------------------------------------------------

    list.append(1);
    assertEquals("{5}->{4}->{3}->{2}->{1}->NULL", list.toString()); //Test for appending one node
    list.append(8);
    list.append(9);
    assertEquals("{5}->{4}->{3}->{2}->{1}->{8}->{9}->NULL", list.toString());//Test for appending  multiple nodes
    list.insertBefore(9, 8);
    assertEquals("{5}->{4}->{3}->{2}->{1}->{8}->{8}->{9}->NULL", list.toString());//Test for inserting a node before a node located i the middle of a linked list
////testInsertBeforeFirst()----->Test for inserting a node before the first node of a linked list
//    list.insertBefore(5,6);
//    assertEquals("{5}->{4}->{3}->{2}->{1}->{5}->{8}->{8}->{9}->NULL",list.toString());
    list.insertAfter(1, 7);
    assertEquals("{5}->{4}->{3}->{2}->{1}->{7}->{8}->{8}->{9}->NULL", list.toString()); //Test for inserting after a node in the middle of the linked list
    list.insertAfter(9, 10);
    list.insertAfter(10, 11);
    assertEquals("{5}->{4}->{3}->{2}->{1}->{7}->{8}->{8}->{9}->{10}->{11}->NULL", list.toString()); //    Test for inserting a node after the last node of the linked list

    //------------------------------------------------------------------- Linked list k-th value --------------------------------------------------------
    assertEquals(-1, list.kthFromEnd(15)); //Where k is greater than the length of the linked list
    assertEquals(5, list.kthFromEnd(10)); //Where k and the length of the list are the same
    assertEquals(-1, list.kthFromEnd(-5));//Where k is not a positive integer
    assertEquals(8, list.kthFromEnd(4)); //“Happy Path” where k is not at the end, but somewhere in the middle of the linked list


  }
}
