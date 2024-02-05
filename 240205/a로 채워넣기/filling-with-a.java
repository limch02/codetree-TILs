import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder k = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (i==1||i==s.length()-2){
                k.append("a");
            }else {
                k.append(s.charAt(i));
            }
        }
        System.out.println(k);
    }
}