import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int sum =0;
        int cnt = 0;
        for (int j = n;j<=m;j++){
            for (int k = 1;k<j;k++){
                if (j%k==0){
                    sum+=k;
                }
            }
            if (sum == j){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}