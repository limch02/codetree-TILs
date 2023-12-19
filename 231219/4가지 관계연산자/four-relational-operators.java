import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a>=b){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        if (a>b){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        if (a<=b){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        if (a<b){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        System.out.print(sb);
    }
}