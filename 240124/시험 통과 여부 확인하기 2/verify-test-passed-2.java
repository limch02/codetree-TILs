import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt= 0;
        for (int i = 0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum =0;
            for (int j = 0;j<4;j++){
                int g = Integer.parseInt(st.nextToken());
                sum += g;
            }
            if (sum/4>=60){
                System.out.println("pass");
                cnt++;
            }else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}