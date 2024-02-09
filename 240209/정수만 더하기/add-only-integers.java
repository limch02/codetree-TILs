import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum =0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println(sum);
    }
}