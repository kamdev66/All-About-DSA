import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      int []arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int [] nsr=NSR(arr);
      int [] nsl=NSL(arr);
              long sum=0;
        int mod=1000000007;
        for(int i=0;i<n;i++){
            sum= (sum + (long)(arr[i]*(long)(i-nsl[i])*(nsr[i]-i)))%mod;
            
        }
      System.out.println(sum);
	}


       public static  int[] NSR(int [] arr){
            int n= arr.length;
            int [] nsr=new int [n];
            Stack<Integer> st = new Stack<>();
            nsr[n-1]=n;
         st.push(n-1);
            for(int i=n-2;i>=0;i--){

                 if(arr[st.peek()]<arr[i]){
                    nsr[i]=st.peek();
                }
                else{
                  while(!st.empty() && arr[st.peek()]>arr[i]){
                    st.pop();
                    } 
                    if(!st.empty()){
                        nsr[i]=st.peek();
                    }
                    else{
                        nsr[i]=n;
                    }
                }         
                    st.push(i);
            }
            return nsr;
        }
    
        public static  int[] NSL(int [] arr){
            int n= arr.length;
            int [] nsl=new int [n];
            Stack<Integer> st = new Stack<>();
             nsl[0]=-1;
            st.push(0);
            for(int i=1;i<n;i++){
                if(arr[st.peek()]<arr[i]){
                    nsl[i]=st.peek();
                }
                else{
                    while(!st.empty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                    } 
                    if(!st.empty()){
                        nsl[i]=st.peek();
                    }
                    else{
                        nsl[i]=-1;
                    }
                }
                       st.push(i);
            }
            return nsl;
        }
}