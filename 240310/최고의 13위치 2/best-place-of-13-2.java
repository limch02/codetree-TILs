import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];
        for (int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max_cnt = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        if (i == k && Math.abs(j - l) <= 2)//
                            continue;

                        int cnt1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        int cnt2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];
                        max_cnt = Math.max(max_cnt, cnt1 + cnt2);
                    }
                }
            }
        }
        System.out.println(max_cnt);
    }
}