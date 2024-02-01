import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String c = br.readLine();
        int cnt = 0;
        for (int i = 0;i<s.length();i++){
            if (c.equals(String.valueOf(s.charAt(i)))) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}