import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 5;
        int b = 6;
        int c = 7;
        a = c;
        b =c;
        System.out.println(a+" "+b+" "+c);
    }
}