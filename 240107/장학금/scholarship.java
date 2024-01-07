import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a>=90){
            if(b>=95){
                sb.append(100000);
            } else if(b>=90){
                sb.append(50000);
            } else{
                sb.append(0);
            }
        }else{
            sb.append(0);
        }
        System.out.println(sb);
    }
}