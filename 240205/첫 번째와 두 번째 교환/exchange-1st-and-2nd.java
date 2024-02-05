import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        char a1 = s.charAt(0);
        char a2 = s.charAt(1);
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == a1){
                sb.append(a2);
            } else if (s.charAt(i)==a2) {
                sb.append(a1);
            }else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}