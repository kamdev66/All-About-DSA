/*
Problem Statement

Given a string of N characters and a character C, find the position of that character in that string. If there are multiple occurrences, return the first occurrence from the left.

The string is 1-index based and you need to return the index of the position of the matching character.

If the character is not present, return -1.

Input Format

First-line contains the integer N. Second-line contains the string stn. Third-line contains the character C. Constraints

1<=N<=10^5 The string contains only lowercase characters. Output Format

Return the index of the matching character. Evaluation Parameters

Sample Input 4 dhwe w Sample Output 3 Explanation In string 'dhwe', the position of the characters is d=1, h=2, w=3 and e=4. So the position of w will be 3.

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
      String s=sc.next();
      char c=sc.next().charAt(0);
      Boolean val=false;
      int ans=-1;
      for(int i=0;i<n;i++){
        if(s.charAt(i)==c){
          val=true;
          ans=i+1;
          break;
        }
      }
      if(val==true){
          System.out.println(ans);
        }else{
          System.out.println("-1");
        }
	}
}