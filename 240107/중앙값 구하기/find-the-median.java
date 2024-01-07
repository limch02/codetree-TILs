import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a>b){
            if (a<c){
                sb.append(a);
            } else if (c>b&&a>c) {
                sb.append(c);
            } else {
                sb.append(b);
            }
        } else {
            if (b<c){
                sb.append(b);
            } else if (c>a&&b>c) {
                sb.append(c);
            }else {
                sb.append(a);
            }
        }
        System.out.println(sb);
    }
}