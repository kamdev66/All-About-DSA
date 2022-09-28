import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        int index = 0;
        int max = 0;
        while (j < n) {
            sum = sum + arr[j];
            while (sum > k) {
                sum = sum - arr[i];
                i++;
            }
            if (sum < k) {
                j++;
            } else if (sum == k) {
                index = j - i + 1;
                max = Math.max(max, index);
                j++;
            }
        }
        System.out.println(max);
    }
}