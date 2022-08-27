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
        void insertAtEnd(int value) {
            Node newNode = new Node(value);
            if (head == null && tail == null) {
                head = newNode;
                tail = newNode;
                tail.next=head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next=head;
            }
        }
      
        void printLinkedList()
        {
            Node temp=head;
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
            }
        }
        public class Main
        {
            public static void main (String[] args)
            {
                Linkedlist List1 =new Linkedlist();
                Scanner sc =new Scanner(System.in);
                int n = sc.nextInt();
                for(int i=0;i<n;i++){
                    int x=sc.nextInt();
                    List1.insertAtEnd(x);
                }
                int k= sc.nextInt();
                    List1.insertAtEnd(k);
                    List1.printLinkedList();
                }
        }