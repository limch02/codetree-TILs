import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String k = br.readLine();
        String l = br.readLine();
        int min = Math.min(s.length(),k.length());
        Math.min(min,l.length());
        System.out.println(min);
    }
}