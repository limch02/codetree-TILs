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
        int min = a;
        if (min>b){
            min = b;
        } else if (min>c) {
            min = c;
        }
        if (min==a){
            sb.append("1 ");
        }else {
            sb.append("0 ");
        }
        if (a==b&&a==c){
            sb.append("1");
        }else {
            sb.append("0");
        }
        System.out.print(sb);
    }
}