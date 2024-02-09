import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char c1 = (char)(c-'A'+'a');
                sb.append(c1);
            } else if (c>='a'&&c<='z') {
                sb.append(c);
            } else if ((int)c >=48&&(int)c<=57) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}