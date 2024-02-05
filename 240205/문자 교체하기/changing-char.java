import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String k = st.nextToken();
        for (int i=0;i<2;i++){
            sb.append(s.charAt(i));
        }
        for (int i=2;i<k.length();i++){
            sb.append(k.charAt(i));
        }
        System.out.println(sb);
    }
}