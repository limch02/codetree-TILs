import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0;i<a;i++) {
            StringTokenizer ss = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(ss.nextToken());
            int m = Integer.parseInt(ss.nextToken());
            System.out.println(n*m);
        }
    }
}