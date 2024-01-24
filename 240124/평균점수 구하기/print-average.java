import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        for (int i = 0;i<8;i++) {
            sum += Double.parseDouble(st.nextToken());
        }
        String s = String.format("%.1f",sum/8);
        System.out.println(s);
    }
}