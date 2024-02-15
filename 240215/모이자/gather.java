import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        for (int i =1;i<=a;i++){
            int sum =0;
            for (int j = 1;j<=a;j++){
                sum += arr[j-1]*Math.abs(i-j);
            }
            if (min>sum){
                min = sum;
            }
        }
        System.out.println(min);
    }
}