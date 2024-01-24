import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        double cnt = 0;
        for (int i =0;i<10;i++){
            int a = Integer.parseInt(st.nextToken());
            if (a>=250){
                break;
            }else {
                sum += a;
                cnt++;
            }
        }
        String s = String.format("%.1f",sum/cnt);
        System.out.println((int)sum+" "+s);
    }
}