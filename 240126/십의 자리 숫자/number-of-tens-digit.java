import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[9];
        while (true){
            int a = Integer.parseInt(st.nextToken());
            if (a==0){
                break;
            }
            int b= a/10;
            if (b>=1) {
                arr[b - 1]++;
            }
        }
        for (int i = 0 ;i<9;i++){
            System.out.println((i+1)+" - "+arr[i]);
        }
    }
}