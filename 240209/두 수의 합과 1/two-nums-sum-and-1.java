import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int a1 = Integer.parseInt(st.nextToken());
       int a2 = Integer.parseInt(st.nextToken());
       String s = String.valueOf(a1+a2);
       int cnt =0;
       for (int i =0;i<s.length();i++){
           if (s.charAt(i)=='1'){
               cnt++;
           }
       }
        System.out.println(cnt);
    }
}