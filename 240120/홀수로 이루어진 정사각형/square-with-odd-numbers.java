import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 1;i<=n;i++){
            int k = 11+2*(i-1);
            for (int j = 1;j<=n;j++){
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
        }
    }
}