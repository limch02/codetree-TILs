import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if (s.equals("END")){
                break;
            }
            String k = "";
            for (int i =0;i<s.length();i++){
                k += s.charAt(s.length()-1-i);
            }
            System.out.println(k);
        }
    }
}