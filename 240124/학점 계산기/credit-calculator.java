import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i<a;i++) {
            sum += Double.parseDouble(st.nextToken());
        }
        String s = String.format("%.1f",sum/a);
        System.out.println(s);
        if (Double.parseDouble(s)>=4.0){
            System.out.println("Perfect");
        } else if (Double.parseDouble(s)>=3.0) {
            System.out.println("Good");
        }else {
            System.out.println("Poor");
        }
    }
}