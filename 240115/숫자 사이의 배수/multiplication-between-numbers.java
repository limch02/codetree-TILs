import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double sum = 0;
        double cnt = 0;
        for (int i =a; i <=b;i++){
            if (i%5==0){
                cnt++;
                sum+=i;
            } else if (i%7==0) {
                cnt++;
                sum+=i;
            }
        }
        String s = String.format("%.0f",sum);
        String k = String.format("%.1f",(sum/cnt));
        System.out.print(s+" "+k);
    }
}