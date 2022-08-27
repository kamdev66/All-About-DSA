import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
    public static void main (String[] args) throws java.lang.Exception
  {
  Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int k=0;k<t;k++){
      int n=sc.nextInt();
        int x=sc.nextInt();
      int[][] a=new int[n][n];
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
          int i=0;
        int j=n-1; 
        boolean flag=false;
        while(i<n && j>=0)
          {
            if(a[i][j]==x)
            {
              flag=true;
               System.out.println(i+" "+j);
            break;
            }
            else if(a[i][j]>x)
            {
              j--;
            }
            else
              i++;
          }
        if(flag==false)
        {
             System.out.println("-1"+" "+"-1");
        }
    }
  }
}