// "static void main" must be defined in a public class.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        //length
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        
        //charAt
        char ch2=s.charAt(1);
        System.out.println(ch2);
        //print all Char Array
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.println(ch);
        }
        */
        
    /*    //substring() method
        String s="abcd";
        System.out.println(s.substring(0,2));
        System.out.println(s.substring(2));
    */
        
        //split() method
        String s="abc,def,ghi,jkl mno";
        String[] parts=s.split(",");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }
        
    }
}