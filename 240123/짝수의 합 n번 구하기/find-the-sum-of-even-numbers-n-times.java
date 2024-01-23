import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i<a;i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(s.nextToken());
            int m = Integer.parseInt(s.nextToken());
            int sum = 0;
            for (int j = n; j <= m; j++) {
                if (j % 2 == 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}