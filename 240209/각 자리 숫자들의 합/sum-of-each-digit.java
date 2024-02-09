import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       String a1 = (st.nextToken());
       int sum =0;
       for (int i =0;i<a1.length();i++){
           sum += a1.charAt(i)-'0';
       }
        System.out.println(sum);
    }
}