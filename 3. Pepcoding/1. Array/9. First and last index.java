import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int data=sc.nextInt();
    
    int lo=0;
    int hi=n-1;
    int fi=-1;
    
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(data>arr[mid]){
            lo=mid+1;
        }
        else if(data<arr[mid]){
            hi=mid-1;
        }else{
            fi=mid;
            hi=mid-1;
        }
        
    }
    System.out.println(fi);
    
     lo=0;
     hi=n-1;
    int li=-1;
    
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(data>arr[mid]){
            lo=mid+1;
        }
        else if(data<arr[mid]){
            hi=mid-1;
        }else{
            li=mid;
            lo=mid+1;
        }
        
    }
    System.out.println(li);
 }

}