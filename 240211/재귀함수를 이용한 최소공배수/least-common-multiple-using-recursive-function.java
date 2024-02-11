import java.util.*;
import java.io.*;
public class Main {
    public static int GCD(int x, int y) {
        int r;
        while(x % y != 0) {
            r = x  % y;
            x = y;
            y = r;
        }
        return y;
    }
    public static int LCM(int x, int y) {
        return x * y / GCD(x, y);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = 1;
        for (int i = 0;i<a;i++){
            int k = Integer.parseInt(st.nextToken());
            b = LCM(k,b);
        }
        System.out.println(b);
    }
}