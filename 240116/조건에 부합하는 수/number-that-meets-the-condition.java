import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int s = 0;
        for (int i = 1;i<=a;i++){
            if (i%2==0&i%4!=0){
                continue;
            } else if ((i/8)%2==0) {
                continue;
            } else if (i%7<4) {
                continue;
            }else {
                System.out.print(i+" ");
            }
        }
    }
}