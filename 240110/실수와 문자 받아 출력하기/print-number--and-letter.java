import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String k = String.format("%.2f",a);
        String l = String.format("%.2f",b);
        System.out.println(s);
        System.out.println(k);
        System.out.println(l);
    }
}