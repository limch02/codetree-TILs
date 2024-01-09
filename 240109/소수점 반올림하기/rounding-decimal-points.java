import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 25.352;
        String s = String.format("%.1f",a);
        System.out.println(s);
    }
}