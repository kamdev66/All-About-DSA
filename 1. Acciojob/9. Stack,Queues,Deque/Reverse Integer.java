import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {   
      Scanner sc= new Scanner(System.in);
       int number=sc.nextInt();
       long reverse = 0;
       long i=1;
       Stack<Integer> st= new Stack<>();
         int x=1;
          if(number<0){
          x=-1;
          number=x*number;
        }
        while(number > 0)
        {
            st.push(number % 10);
            number = number / 10;
        }
        while (!st.empty())
        {
            reverse = reverse + (st.peek()*i);
            st.pop();
             i=i*10;
        }
          reverse=x*reverse;
       if(reverse>=Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
        System.out.println("0"); 
       }else{
         System.out.println(reverse);
       }
    }
}