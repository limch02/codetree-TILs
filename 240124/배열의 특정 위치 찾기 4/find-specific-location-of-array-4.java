import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum =0;
        double cnt = 0;
        while (st.hasMoreTokens()){
            int d = Integer.parseInt(st.nextToken());
            if (d == 0){
                break;
            }else {
                if (d%2==0){
                    sum+=d;
                    cnt++;
                }
            }
        }
        String s = String.format("%.1f",sum/cnt);
        System.out.println((int)cnt+" "+(int)sum);
    }
}