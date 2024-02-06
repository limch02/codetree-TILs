import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int a = s.indexOf("e");;
        for (int i = 0;i<s.length();i++){
            if (i == a) {
                continue;
            }else {
                System.out.print(s.charAt(i));
            }
        }
    }
}