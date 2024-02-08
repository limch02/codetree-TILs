import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder k = new StringBuilder();
        for (int i =0;i<s.length();i++){
            int a = s.charAt(i);
            if (a<97){
                a = a+32;
                k.append((char) a);
            }else{
                a -=32;
                k.append((char) a);
            }

        }
        System.out.println(k);
    }
}