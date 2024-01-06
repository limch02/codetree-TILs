import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if (a%3==0||a%5==0){
            sb.append(1);
        }else {
            sb.append(0);
        }
        System.out.println(sb);
    }
}