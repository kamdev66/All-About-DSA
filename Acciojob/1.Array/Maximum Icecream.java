/*
Problem Statement

There is an ice cream shop near your house. There are N different types of ice creams available in the shop. You are given the prices of these N different ice creams. You have X amount of cash with you.

You have to determine what is the maximum number of different types of ice creams that you can buy.

Input Format

The first line of input contains the integer N denoting the different types of ice creams. The next N lines contain an integer price[i] denoting the price of ith ice cream. The next line contains the integer X denoting the amount of cash that you have. Constraints

1 <= N <= 105 1 <= price[i] <= 105 1 <= X <= 106 Output Format

Return the maximum number of different types of ice creams that you can buy. Evaluation Parameters

Sample Input 3 1 2 3 4 Sample Output 2 Explanation You can buy two ice creams with price 1 and 2 with a total of 3 which is less than 4.



*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int cash=sc.nextInt();
      Arrays.sort(arr);
      int total=0;
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum<=cash){
          total++;
        }
      }
      System.out.println(total);
	}
}