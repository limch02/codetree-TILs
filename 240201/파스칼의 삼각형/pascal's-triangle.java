import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[][] arr = new int[a][a];
        for (int i= 0;i<a;i++){
            for (int j =0;j<a;j++){
                arr[i][j]=0;
            }
        }
        for (int i= 0;i<a;i++){
            for (int j =0;j<=i;j++){
                if (j==i||j==0){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i= 0;i<a;i++){
            for (int j =0;j<a;j++){
                if (arr[i][j]!=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}