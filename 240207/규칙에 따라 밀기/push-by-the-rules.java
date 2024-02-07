import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String k = br.readLine();
        for (int i =0;i<k.length();i++){
            char c = k.charAt(i);
            if (c == 'L') {
                s = s.substring(1,s.length())+s.charAt(0);
            }else {
                s = s.charAt(s.length()-1)+ s.substring(0,s.length()-1);
            }
        }
        System.out.println(s);
    }
}