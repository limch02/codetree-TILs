import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char c = st.nextToken().charAt(0);
        int a = Integer.parseInt(st.nextToken());
        System.out.print((int)c+" "+(char)a);
    }
}