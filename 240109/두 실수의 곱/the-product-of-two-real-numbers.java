import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 5.26;
        double b = 8.27;
        String s = String.format("%.3f",a*b);
        System.out.println(s);

    }
}