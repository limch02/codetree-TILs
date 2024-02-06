import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        for (int i = 1;i<s.length();i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println(s.charAt(0));
    }
}