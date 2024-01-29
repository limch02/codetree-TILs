import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0;j<4;j++){
                int a = Integer.parseInt(st.nextToken());
                sum += a;
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}