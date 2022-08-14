// "static void main" must be defined in a public class.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       // String s1="Hello World";
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();  
        String s2=sc.nextLine();  
        String s3=sc.next();      
        String s4=sc.next();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
/*
Input:- 
abc def
ghi jkl
zxc opi
*/
/* Output:- 
abc def
ghi jkl
zxc
opi

*/