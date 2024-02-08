import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        int k = (int)c-1;
        if (k==96){
            k = 122;
        }
        System.out.println((char)k);
    }
}