import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int [][] arr1 = new int[n][m];
        int [][] arr2 = new int[n][m];
        for(int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++){
                int a = Integer.parseInt(st.nextToken());
                arr1[i][j] = a;
            }
        }
        for(int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++){
                int a = Integer.parseInt(st.nextToken());
                arr2[i][j] = a;
            }
        }
        for(int i = 0; i <n; i++) {
            for (int j=0;j<m;j++){
                if (arr1[i][j]==arr2[i][j]){
                    arr1[i][j] = 0;
                }else {
                    arr1[i][j] = 1;
                }
            }
        }
        for(int i = 0; i <n; i++) {
            for (int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}