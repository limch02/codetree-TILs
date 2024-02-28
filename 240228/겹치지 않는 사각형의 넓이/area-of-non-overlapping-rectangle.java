import java.io.*;
import java.util.*;

public class Main {
    static int sum =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] arr = new int[2001][2001];
        for (int i =0;i<3;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            if (i!=2) {
                for (int k = n1 + 1000; k < n2 + 1000; k++) {
                    for (int j = m1 + 1000; j < m2 + 1000; j++) {
                        if (arr[k][j] != 1) {
                            arr[k][j] = 1;
                            sum++;
                        }
                    }
                }
            }else {
                for (int k = n1 + 1000; k < n2 + 1000; k++) {
                    for (int j = m1 + 1000; j < m2 + 1000; j++) {
                        if (arr[k][j] == 1) {
                            arr[k][j] = 0;
                            sum--;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}