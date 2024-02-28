import java.io.*;
import java.util.*;

public class Main {
    static int sum =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [][] arr = new int[201][201];
        for (int i =0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            for (int k =n1+100;k<n2+100;k++) {
                for (int j = m1 + 100; j < m2 + 100; j++) {
                    if (arr[k][j] != 1) {
                        arr[k][j] = 1;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}