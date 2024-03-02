import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int max = 0;
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int c = Integer.parseInt(s.nextToken());
            if (c>b){
                cnt++;
            }else {
                if (cnt>max){
                    max = cnt;
                }
                cnt = 0;
            }
        }
        if (cnt>max){
            max = cnt;
        }
        System.out.println(max);
    }
}