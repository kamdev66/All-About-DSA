import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              matrix[i][j]=sc.nextInt();
            }
         }
      int [][]transpose=new int[m][n];        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            transpose[i][j]=  matrix[j][i];
                }
            }
        
      for(int i=0;i<n;i++)
      {   
          int j=0;int k=m-1;
          while(j<k){
               int temp = transpose[i][j];
             transpose[i][j]=transpose[i][k];
              transpose[i][k]=temp;
              j++;k--;
          }
     }
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(transpose[i][j]+" ");
                }
          System.out.println();
            } 
    }
}