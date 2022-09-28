import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class Linkedlist {
    Node head;
    Node tail;

    void insertAtEnd(int value)
    {
        Node newNode = new Node(value);
        if (head == null && tail == null)
        {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

  void Delete_Middle_Node() {
        Node slow = head;
        Node fast = head;
        Node previous = null;
        while (fast != null && fast.next != null ) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (previous != null) {
            previous.next = previous.next.next;
        } else {
            head = null;
        }
  }
  void printLinkedList() {
        if (head == null) {
            System.out.println("-1");
        } else {
            Node temp = head;
            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
      Linkedlist list = new Linkedlist();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.insertAtEnd(x);
        }
        list.Delete_Middle_Node();
        list.printLinkedList();
    }
}