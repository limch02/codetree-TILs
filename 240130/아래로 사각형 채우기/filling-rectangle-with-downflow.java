import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        for (int i = 1;i<=n;i++){
            int cnt = 0;
            for (int j =0;j<n;j++){
                System.out.print((i+cnt*n)+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}