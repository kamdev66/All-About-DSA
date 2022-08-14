import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
   //print code
    public static void display(int[][] arr){
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
          System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
      }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int[][] arr=new int[r][c];
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          arr[i][j]=sc.nextInt();
        }
      }
      int [][] brr=new int[c][r];
      
      for(int i=0;i<brr.length;i++){
        for(int j=0;j<brr[0].length;j++){
          brr[i][j]=arr[j][i];
        }
      }
      display(brr);
      
	}
}