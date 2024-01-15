import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        double sum = 0;
        double cnt = 0;
        for (int i =1; i <=10;i++){
            int a = Integer.parseInt(br.readLine());
            if (a>=0&&a<=200) {
                sum+=a;
                cnt++;
            }
        }
        String s = String.format("%.0f",sum);
        String k = String.format("%.1f",(sum/cnt));
        System.out.println(s+" "+k);
    }
}