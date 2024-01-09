import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 13;
        double b =0.165000;
        String s = String.format("%.6f",b);
        String k = String.format("%.6f",a*b);
        System.out.println(a+" * "+ s +" = "+k);
    }
}