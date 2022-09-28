import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static boolean possible(int[]rank,int n,int mid,int m){
    int job_done=0;
    for(int i=0;i<n;i++){
      int x=1;
          while((x*x+x)/2<=mid/rank[i]){
          x++;
        }
      job_done=job_done+x-1;
      if(job_done >=m){
        return true;
      }
    }
    return false;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
        int []rank=new int [n];
        for(int i=0;i<n;i++){
          rank[i]=sc.nextInt();
        }
      int start=1;int end=Integer.MAX_VALUE;int ans=Integer.MAX_VALUE;
        
      while(start<=end){
        int mid=start+(end-start)/2;
        if(possible(rank,n,mid,m)==true){
          ans=Math.min(mid,ans);
          end=mid-1;
        }else{
          start=mid+1;
        }
      }
      System.out.println(ans);
    }
}