import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int s = 0;
        for (int i = 1;i<=a;i++){
            if (i%2==0){
                continue;
            } else if (i%10==5) {
                continue;
            } else if (i%3==0&&i%9!=0) {
                continue;
            }else {
                System.out.print(i+" ");
            }
        }
    }
}