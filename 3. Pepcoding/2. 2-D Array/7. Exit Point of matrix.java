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
        
        //dir=0->east, 1-> south, 2-> west, 3-north
        int i=0;
        int j=0;
        int dir=0;
        
        while(true){
            dir=(dir+arr[i][j])%4;
            
            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }
            
            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==r){
                i--;
                break;
            }else if(j==c){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}