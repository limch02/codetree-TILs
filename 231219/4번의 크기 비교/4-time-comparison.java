import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        if (a>b){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        if (a>c){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        if (a>d){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        if (a>e){
            sb.append("1\n");
        }else {
            sb.append("0\n");
        }
        System.out.print(sb);
    }
}