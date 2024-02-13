import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        for (int i =0;i<m;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());
            for (int j=a-1;j<b;j++){
                arr[j]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i<n;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}