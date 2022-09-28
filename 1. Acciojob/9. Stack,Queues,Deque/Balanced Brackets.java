import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static boolean isvalid(String str,int n){
    Stack<Character> st=new Stack<>();    
      for(int i=0;i<n;i++){
        if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' )
        {
          st.push(str.charAt(i));
        } else {
           if(st.empty()) {
                    return false;
                }
         else if(str.charAt(i)==')'){
            if(st.peek()!='('){
           return false;
          }
        }
         else if(str.charAt(i)=='}'){
            if(st.peek()!='{'){
           return false;
          }
        }
         else if(str.charAt(i)==']'){
            if(st.peek()!='['){
           return false;
          }
         }
          st.pop();
        }     
      }
      if(st.empty()){
           return true;
        }
    return false;
  }
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String str=sc.next();
       if(isvalid(str, n)==true){
         System.out.println("YES");  
       }else{
          System.out.println("NO");   
       }
    }
}