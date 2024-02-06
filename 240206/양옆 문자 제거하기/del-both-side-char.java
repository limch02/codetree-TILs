import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for (int i = 0;i<s.length();i++){
            if (i==1||i==s.length()-2){
                continue;
            }else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}