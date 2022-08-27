import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{  
   public static boolean helper(int mid,int M,int arr[]){
     int totalFruits=0;
     for(int i=0;i<arr.length;i++){
          if(arr[i]>mid){
            totalFruits+=arr[i]-mid;
          }
     }
     if(totalFruits>=M){
       return true;
     }
     return false;
   }
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       int arr[]=new int[N];
       for(int i=0;i<N;i++){
         arr[i]=sc.nextInt();
       }
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       int ans=-1;
       for(int i=0;i<N;i++){
         max=Math.max(arr[i],max);
         min=Math.min(arr[i],min);
       }
       int start=0;
       int end=max;
      while(start<=end){
        int mid=(start+end)/2;
        if(helper(mid,M,arr)==true){
          ans=Math.max(ans,mid);
          start=mid+1;
        }else{
           end=mid-1;
        }
      }
      System.out.print(ans);
      
    }
}