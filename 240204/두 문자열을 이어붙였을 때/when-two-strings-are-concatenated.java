import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        if ((a+b).equals(b+a)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}