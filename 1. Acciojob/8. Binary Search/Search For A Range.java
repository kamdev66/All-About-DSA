import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int Lo(int a[],int t)
    {
        int n=a.length;  boolean flag=false;
        int st=0;
        int et=n-1;
        int ans=-1;
        while(st<=et){
            int mid=(st+et)/2;
            if(a[mid]==t){
              flag=true;
                ans=Math.max(ans,mid);
                st=mid+1;
            }
             else if(a[mid]<t){
                st=mid+1;
            }
            else{
                et=mid-1;
            }
        }
       if( flag==false){
           return -1;
       }
        return ans;
    }
    public static int Fo(int a[],int t)
    {
        int n=a.length;  boolean flag=false;
        int st=0;
        int et=n-1;
        int ans=n;
        while(st<=et){
           int mid=st+(et-st)/2;
            if(a[mid]==t){
              flag=true;
                ans=Math.min(ans,mid);
                et=mid-1;
            }
            else if(a[mid]<t){
                st=mid+1;
            }
            else{
                et=mid-1;
            }
        }
       if( flag==false){
           return -1;
       }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int t=sc.nextInt();   
       System.out.print(Fo(a,t)+" "+Lo(a,t));
    }
}