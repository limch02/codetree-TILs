import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if (b %2==1){
                if (b%3==0){
                    System.out.println(b);
                }
            }
        }
    }
}