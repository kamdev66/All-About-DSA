import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        int minRow=0;
        int minCol=0;
        int maxRow=r-1;
        int maxCol=c-1;
        int totalElements=r*c;
        int count=0;
        
        while(count<totalElements){
            //left wall
            for(int i=minRow,j=minCol;i<=maxRow && count<totalElements;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minCol++;
           
            //bottom wall
            for(int i=maxRow,j=minCol;j<=maxCol&& count<totalElements;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxRow--;
            
            //right wall
            for(int i=maxRow,j=maxCol;i>=minRow && count<totalElements;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxCol--;
            
            //top wall
            for(int i=minRow,j=maxCol;j>=minCol&& count<totalElements;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minRow++;
            
        }
        
    }
}