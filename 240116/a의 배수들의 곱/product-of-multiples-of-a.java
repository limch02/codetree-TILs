import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int s = 1;
        for (int i = 1;i<=b;i++){
            if (i%a==0){
                s *=i;
            }
        }
        System.out.println(s);
    }
}