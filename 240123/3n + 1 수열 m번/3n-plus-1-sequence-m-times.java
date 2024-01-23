import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0;i<a;i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            while (true) {
                if (n == 1) {
                    System.out.println(cnt);
                    break;
                } else {
                    if (n % 2 == 0) {
                        n /= 2;
                        cnt++;
                    } else {
                        n = n * 3 + 1;
                        cnt++;
                    }
                }
            }
        }
    }
}