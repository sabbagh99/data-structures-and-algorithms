/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testInsert (){
      LinkedList list = new LinkedList();
      list.insert(6);
      list.insert(7);
      list.insert(8);
      assertEquals("the expected output should be {8}->{7}->{6}->NULL","{8}->{7}->{6}->NULL",list.toString());
      assertEquals("The head should be the the last inserted number which is 5",5,list.insert(5));
    }
    @Test public void testIncludes(){
      LinkedList list = new LinkedList();
      list.insert(6);
      list.includes(6);
      assertTrue(list.includes(6));
      assertFalse(list.includes(9));
    }

  //---------------------- Linked list part two --------------------------

  @Test public void testAppend(){ // Test for appending one node
      LinkedList list = new LinkedList();
      list.insert(6);
      list.insert(7);
      list.append(8);

      assertEquals("the expected output should be {7}->{6}->{8}->NULL","{7}->{6}->{8}->NULL",list.toString());
    }
  @Test public void testAppendMulti(){ // Test for appending  multiple nodes
    LinkedList list = new LinkedList();
    list.insert(7);
    list.insert(6);
    list.append(8);
    list.append(9);
    list.append(10);
    assertEquals("the expected output should be {6}->{7}->{8}->{9}->{10}->NULL","{6}->{7}->{8}->{9}->{10}->NULL",list.toString());
  }
  @Test public void testInsertBefore(){ // Test for inserting a node before a node located i the middle of a linked list
    LinkedList list = new LinkedList();
    list.insert(7);
    list.insert(6);
    list.append(9);
    list.append(10);
    list.insertBefore(9,8);
    assertEquals("the expected output should be {6}->{7}->{8}->{9}->{10}->NULL","{6}->{7}->{8}->{9}->{10}->NULL",list.toString());
  }
//  @Test public void testInsertBeforeFirst(){ // Test for inserting a node before the first node of a linked list
//    LinkedList list = new LinkedList();
//    list.insert(7);
//    list.insert(6);
//    list.append(9);
//    list.append(10);
//    list.insertBefore(6,5);
//    assertEquals("the expected output should be {6}->{7}->{8}->{9}->{10}->NULL","{6}->{7}->{8}->{9}->{10}->NULL",list.toString());
//  }

  @Test public void testInsertAfter(){ // Test for inserting after a node in the middle of the linked list
    LinkedList list = new LinkedList();
    list.insert(8);
    list.insert(6);
    list.insert(5);
    list.insertAfter(6,7);
    assertEquals("the expected output should be {5}->{6}->{7}->{8}->NULL","{5}->{6}->{7}->{8}->NULL",list.toString());
  }
  @Test public void testInsertAfterLast(){ // Test for inserting  a node after the last node of the linked list
    LinkedList list = new LinkedList();
    list.insert(8);
    list.insert(6);
    list.insert(5);
    list.insertAfter(6,7);
    list.insertAfter(8,9);
    assertEquals("the expected output should be {5}->{6}->{7}->{8}->{9}->NULL","{5}->{6}->{7}->{8}->{9}->NULL",list.toString());
  }
}
