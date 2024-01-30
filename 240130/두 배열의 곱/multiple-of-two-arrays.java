import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int[3][3];
        for(int i = 0; i <3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<3;j++){
                int a = Integer.parseInt(st.nextToken());
                arr1[i][j] = a;
            }
        }
        String s = br.readLine();
        for(int i = 0; i <3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<3;j++){
                int a = Integer.parseInt(st.nextToken());
                arr2[i][j] = a;
            }
        }
        for(int i = 0; i <3; i++) {
            for (int j=0;j<3;j++){
                System.out.print(arr1[i][j]*arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}