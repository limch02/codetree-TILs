import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        boolean k = false;
        for (int i =a;i<=b;i++){
            if (i%c==0){
                k = true;
            }
        }
        if (k){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}