import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      Stack<Character> st=new Stack<>();    
      for(int i=0;i<str.length();i++){
        st.push(str.charAt(i));
      }
      while(!st.empty()){
        System.out.print(st.pop());
      }
      }
}