import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [][] arr = new int[200][200];
        int s = 0;
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())+100;
            int y = Integer.parseInt(st.nextToken())+100;
            for (int j=x;j<x+8;j++){
                for (int k = y;k<y+8;k++){
                    if (arr[j][k]!=1){
                        arr[j][k] =1;
                        s++;
                    }
                }
            }
        }
        System.out.println(s);
    }
}