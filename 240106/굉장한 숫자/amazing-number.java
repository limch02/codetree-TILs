import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if (a%2==1&&a%3==0){
            sb.append("true");
        } else if (a%2==0&&a%5==0) {
            sb.append("true");
        }else {
            sb.append("false");
        }
        System.out.println(sb);
    }
}