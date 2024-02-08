import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum =0;
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            sum += b;
        }
        String s = String.valueOf(sum);
        s= s.substring(1,s.length())+s.charAt(0);
        System.out.println(s);
    }
}