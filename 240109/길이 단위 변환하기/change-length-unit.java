import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 9.2;
        double b = 1.3;
        String s = String.format("%.1f",a*30.84);
        String k = String.format("%.1f",b*160934);
        System.out.println(a+"ft = "+s+"cm");
        System.out.println(b+"mi = "+k+"cm");
    }
}