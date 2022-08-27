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
        Node newNode=new Node(value);
        if(head==null && tail ==null)     
        {
            head = newNode;           
            tail = newNode;
        }else{                            
                tail.next=newNode;      
                tail=newNode;        
        }
    }
  void ReverseLinkedList()      
    {
        Node previousNode = null;
        Node currentNode = head;
        while(currentNode!=null){
         
            Node nxt= currentNode.next;
            currentNode.next=previousNode;

            previousNode=currentNode;
            currentNode=nxt;
        }
        head=previousNode;    
    }
  void printLinkedList()      
    {
        Node temp=head;        
        while(temp!=null){

            System.out.print(temp.data+" ");
            temp=temp.next;                
        }
        System.out.println();
    }
}

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Linkedlist list1 =new Linkedlist();
        Linkedlist list2 =new Linkedlist();
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
      int []arr=new int[n];
      
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
      for(int i=0;i<n;i=i+2){
           int x=arr[i];  
           list1.insertAtEnd(x);
       }
         for(int i=1;i<n;i=i+2){
           int x=arr[i];  
           list2.insertAtEnd(x);
       }
      list2.ReverseLinkedList();
      Node temp=list1.tail;
      temp.next=list2.head;
      list1. printLinkedList();  
    }
}