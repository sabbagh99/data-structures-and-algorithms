package linkedList;

import java.util.ArrayList;

public class LinkedList {
    public Node head;
    public Node last = null;

    public int insert(int value) {
        try {
            Node current = head;
            head = new Node(value);
            if (current != null) {
                head.next = current;
            }

        } catch (Exception e) {
            System.out.println("problem in insert method");
        }
        return head.value;
    }

    public boolean includes(int value) {
        Node current = head;
        try {
            while (current != null) {
                if (value == current.value) {
                    return true;
                }
                current = current.next;
            }
        } catch (Exception e) {
            System.out.println("problem in include method");
        }
        return false;
    }

    //---------------- Linked list part two --------------------------
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = new Node(value);
        }
        newNode.next = null;
        last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            head = new Node(newValue);
        }
        newNode.next = null;
        last = head;
        while (last.next.value != value) {
            last = last.next;
        }
        newNode.next = last.next;
        last.next = newNode;

    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            head = new Node(newValue);
        }
        newNode.next = null;
        last = head;
        while (last.value != value) {
            last = last.next;
        }
        newNode.next = last.next;
        last.next = newNode;
    }

    public int kthFromEnd(int k) {
        Node current = head;
        int kNode = 0;
        ArrayList<Integer> linkedListArr = new ArrayList<Integer>();
        while (current != null) {
            linkedListArr.add(current.value);
            current = current.next;
        }
        System.out.println(linkedListArr);
        int[] newArr = new int[linkedListArr.size()];
        int j = 0;
        for (int i = linkedListArr.size() - 1; i >= 0; i--) {
            newArr[j] = linkedListArr.get(i);
            j++;
        }

        for (int i = 0; i < newArr.length; i++) {
            kNode = newArr[k];
        }
        return kNode;
    }

     public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
         System.out.println(head);
    }

    public String toString() {
        String string = "";
        Node current = head;
        while (current != null) {
            string += "{" + current.value + "}->";
            current = current.next;
        }
        if (head != null) {
            string += "NULL";
        }

        return string;
    }
}
