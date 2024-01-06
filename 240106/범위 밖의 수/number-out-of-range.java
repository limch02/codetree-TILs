import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if (a<10||a>20){
            sb.append("yes");
        }else {
            sb.append("no");
        }
        System.out.println(sb);
    }
}