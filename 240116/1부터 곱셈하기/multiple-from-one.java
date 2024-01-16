import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int s = 0;
        int k = 0;
        for (int i = 1;i<=a;i++){
            if (s>=a){
                break;
            }
            s*=i;
            k =i;
        }
        System.out.println(k);
    }
}