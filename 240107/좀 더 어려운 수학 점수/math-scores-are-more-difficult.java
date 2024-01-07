import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringTokenizer s = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(s.nextToken());
        int d = Integer.parseInt(s.nextToken());
        if(a>c){
            sb.append("A");
        }else if (a == c){
            if (b>d){
                sb.append("A");
            }else {
                sb.append("B");
            }
        } else {
            sb.append("B");
        }
        System.out.println(sb);
    }
}