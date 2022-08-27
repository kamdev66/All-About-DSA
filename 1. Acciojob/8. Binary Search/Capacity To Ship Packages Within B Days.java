import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static boolean func(int []weight,int B,long mid,int A){
    int days=1;long package_weight=0;
    for(int i=0;i<A;i++){
      if(weight[i]>mid){
        return false;
      }
      if((package_weight+weight[i])>mid){
        days=days+1;
        if(days>B){
          return false;
        }
          package_weight=weight[i];
      }else{
        package_weight+=weight[i];
        
      }
    }
    return true;
  }
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc =new Scanner (System.in);  
        int A =sc.nextInt();
       long sum=0;long  ans=Long.MAX_VALUE;
        int []weight=new int [A];
      
      for(int i=0;i<A;i++){
        weight[i]=sc.nextInt();
        sum=sum+weight[i];
      }
        int B =sc.nextInt();
     long start=1;long end=sum;
      while(start<=end){
       long mid=start+(end-start)/2;
        if(func(weight,B,mid,A)==true){
          ans=Math.min(mid,ans);
          end=mid-1;
        }else{
          start=mid+1;
        }
      }
        System.out.println(ans);
    }
}