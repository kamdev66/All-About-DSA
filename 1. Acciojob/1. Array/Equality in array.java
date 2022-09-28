import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
         Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] freq= new int [101];
        int maxFreq=0;
        for (int i=0;i<n;i++){
            freq [arr[i]]++;
            if (maxFreq<freq[arr[i]]){
                maxFreq=freq[arr[i]];
            }
        }
        System.out.println(n-maxFreq);
    }
}