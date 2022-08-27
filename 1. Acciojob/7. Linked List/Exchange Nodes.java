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
      void exchangeNode() {
      Node temp=head;
        while(temp.next!=head){
        temp=temp.next; 
        }
        int x=head.data;
        head.data=temp.data;
        temp.data=x;
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
                Linkedlist List=new Linkedlist();
                Scanner sc =new Scanner(System.in);
                int n = sc.nextInt();
                for(int i=0;i<n;i++){
                    int x=sc.nextInt();
                    List.insertAtEnd(x);
                }
              List.exchangeNode()  ; 
              List.printLinkedList();
                }
        }