import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }

  class LinkedList{
    Node head;
    void add(int data){
      Node new_Node=new Node(data);
      if(head==null){
        head= new_Node;
        return;
      }
      Node curr=head;
      while(curr.next!=null){
        curr=curr.next;
      }
      curr.next=new_Node;
    }
  }

public class Main
{
   public static void reverse(Node curr){
     if(curr.next != null){
       reverse(curr.next);
     }
     System.out.print(curr.data+ " ");
   }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
         int x=sc.nextInt();
         list.add(x);       //It is calling line no.=16
       }
      reverse(list.head);
      System.out.println("");
	}
}