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
}
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Linkedlist list1 =new Linkedlist();     //1st linkedlist to compare
       Linkedlist list2 =new Linkedlist();     //2nd linkedlist to compare
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();      // 2
        int n = sc.nextInt();      // 1
        for(int i=0;i<m;i++){
            int x=sc.nextInt();    // 1 2 input
            list1.insertAtEnd(x);  //adding the integer in the end to the 1st linkedlist.
        }
        for(int i=0;i<n;i++){
            int x=sc.nextInt();    // 1 input
            list2.insertAtEnd(x);  //adding the integer in the end to the 2nd linkedlist.
        }
        if (n != m) {
            System.out.println("0");      
        }
        else{
            Node i = list1.head;      // i pointer at first node of first linkedlist.
            Node j = list2.head;      // j pointer at first node of second linkedlist.
            boolean flag=true;

            while(i!=null && j!=null){  // itertating all over the length.
                if(i.data!=j.data){     // if values are same
                    flag=false;
                    break;
                }
                i=i.next;               
                j=j.next;
            }
            if(flag==true){           System.out.println("1");
            }else { System.out.println("0");
            }
        }
    }
}