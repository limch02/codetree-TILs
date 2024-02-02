import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = Integer.parseInt(br.readLine());
        if (a>s.length()){
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(s.length() - 1 - i));
            }
        }else {
            for (int i = 0; i < a; i++) {
                System.out.print(s.charAt(s.length() - 1 - i));
            }
        }
    }
}