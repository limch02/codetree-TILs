import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        String s []= new String[a];
        double sum = 0;
        for (int i = 0;i<a;i++){
            s[i] = br.readLine();
        }
        int cnt = 0;
        String t = br.readLine();
        for (int i = 0 ;i<a;i++){
            String k = s[i];
            if (t.equals(String.valueOf(k.charAt(0)))){
                cnt ++;
                sum+= k.length();
            }
        }
        String y = String.format("%.2f",sum/cnt);
        sb.append(cnt).append(" ").append(y);
        System.out.println(sb);
    }
}