import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);
        for (int i =1;i<s.length();i++){
            for (int j = s.length()-i;j<s.length();j++){
                System.out.print(s.charAt(j));
            }for (int j=0;j<s.length()-i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println(s);
    }
}