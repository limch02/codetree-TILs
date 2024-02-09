import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        int a1 = Integer.parseInt(s1+s2);
        int a2 = Integer.parseInt(s2+s1);
        System.out.println(a1+a2);
    }
}