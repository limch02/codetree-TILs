import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        StringTokenizer s = new StringTokenizer(br.readLine());
        int cnt =0;
        for (int i = 0;i<a;i++){
            int c= Integer.parseInt(s.nextToken());
            if (c==b){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}