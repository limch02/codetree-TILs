import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][a];
        for (int i= 0;i<a;i++){
            for (int j =0;j<a;j++){
                arr[i][j]=0;
            }
        }
        for (int i = 0 ; i<b; i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(s.nextToken());
            int d = Integer.parseInt(s.nextToken());
            arr[c-1][d-1] = 1;
        }
        for (int i= 0;i<a;i++){
            for (int j =0;j<a;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}