import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int sum =0;
        int cnt = 0;
        for (int i = 0;i<a;i++){
            String s = br.readLine();
            sum += s.length();
            for (int j = 0;j<s.length();j++) {
                if (String.valueOf(s.charAt(j)).equals("a")) {
                    cnt++;
                }
            }
        }
        sb.append(sum).append(" ").append(cnt);
        System.out.println(sb);
    }
}