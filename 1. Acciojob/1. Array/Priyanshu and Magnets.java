import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner (System.in); 
      int n=sc.nextInt();
      int k=sc.nextInt();
      int []a=new int[n];
      for(int i=0;i<n;i++){a[i]=sc.nextInt();}
      Arrays.sort(a);int max=0;
    int l=0;int r=a[n-1];
        while(l<=r){
          int mid=(l+r)/2;
          if(check(a,n,mid,k)){
            max=Math.max(max,mid);
            l=mid+1;
          }
          else{r=mid-1;}
        }
        System.out.print(max);
      }
//    }
  public static  Boolean check(int []a,int n,int mid,int k){
  int curr=a[0];int m=1;
    for(int i=1;i<n;i++){
      if (a[i] - curr >= mid)
        {
  m++;
  curr= a[i];
   if (m == k)
                return true;
        }
    }
    return false;
}
    
  
}