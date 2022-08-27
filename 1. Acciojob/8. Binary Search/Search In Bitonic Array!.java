import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  public static int peakelement(int arr[],int n){
    int start=0;int end=n-1;
    while(start<=end){
      int mid=start+(end-start)/2;

        if(mid>0 && mid<n-1){
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
          return mid;
        }else  if(arr[mid]>arr[mid+1] && arr[mid]< arr[mid-1]){
         end=mid-1;
        }else if(arr[mid]<arr[mid+1] && arr[mid]> arr[mid-1]){
          start=mid+1;
        }
      }
      if(mid==0){
          if(arr[mid]>arr[mid+1]){
            return mid;
          }else{
            return mid+1;
          }
      }
       if(mid==n-1){
          if(arr[mid]>arr[mid-1]){
            return mid;
          }else{
            return mid-1;
          }
      }
    }
    return -1;
  }
   public static int AscOccurance(int arr[],int start,int end,int k) {
        
       while (start<= end ) {
           int mid = start +(end-start) / 2;
           if (arr[mid]== k) {
              return mid;
           } else if (arr[mid] < k) {
               start = mid + 1;
           } else {
               end = mid - 1;
           }
       }
       return -1;
   }

   public static int DecOccurance(int arr[],int start,int end,int k) {
        
       while (start<= end ) {
           int mid = start +(end-start) / 2;
           if (arr[mid]== k) {
              return mid;
           } else if (arr[mid] > k) {
               start = mid + 1;
           } else {
               end = mid - 1;
           }
       }
       return -1;
   }
  public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int t= sc.nextInt();
         int index=peakelement(arr,n);
         int x=AscOccurance(arr,0,index-1, t) ;
         if(x!=-1){
           System.out.println(x);
         }else{
            System.out.println(DecOccurance(arr,index,n-1,t));
         }  
    }
}