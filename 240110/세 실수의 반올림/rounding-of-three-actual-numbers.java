import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());
        String s = String.format("%.3f",a);
        String d = String.format("%.3f",b);
        String v = String.format("%.3f",c);
        System.out.println(s);
        System.out.println(d);
        System.out.println(v);
    }
}