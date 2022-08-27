import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node previous;
  
    Node(int data) 
    {
        this.data=data;        
        this.next=null; 
        this.previous=null;
    }
}
class Linkedlist {      
    Node head;         
    Node tail;         

    void insertAtEnd(int value) 
    {
        Node newNode=new Node(value);
        if(head==null && tail ==null)       
        {
            head = newNode;                
            tail = newNode; 
        }
            tail.next=newNode;     
            newNode.previous=tail;
            tail=newNode;        
        }

    }


public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Linkedlist list1 =new Linkedlist();
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
       int k=sc.nextInt();
       for(int i=0;i<n;i++){
           int x=sc.nextInt();  
           list1.insertAtEnd(x); 
       }
      
       Node newNode=new Node(k);
      Node newhead=list1.head;
      newNode.next=newhead;
      newNode.previous=null;
      if(newhead!=null){
        newhead.previous=newNode;
      }
      newhead=newNode;

      Node temp=newhead;      
        while(temp!=null){

            System.out.print(temp.data+" ");
            temp=temp.next;                  
        }
    }
}