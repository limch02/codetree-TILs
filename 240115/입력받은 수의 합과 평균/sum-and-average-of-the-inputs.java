import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double sum = 0;
        double cnt = 0;
        for (int i =1; i <=a;i++){
            int b = Integer.parseInt(br.readLine());
            sum+=b;
            cnt++;
        }
        String s = String.format("%.0f",sum);
        String k = String.format("%.1f",(sum/cnt));
        System.out.println(s+" "+k);
    }
}