import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s []= new String[10];
        int cnt = 0;
        for (int i = 0 ;i<10;i++){
            s[i] = br.readLine();
        }
        String k = br.readLine();
        for (int i = 0;i<10;i++){
            String t = s[i];
            if (k.equals(String.valueOf(t.charAt(t.length()-1)))) {
                sb.append(s[i]).append("\n");
                cnt ++;
            }
        }
        if (cnt ==0){
            System.out.println("None");
        }else {
            System.out.println(sb);
        }
    }
}