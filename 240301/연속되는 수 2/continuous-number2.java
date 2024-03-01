import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        int cnt =1;
        int max = 0;
        int last = -1;
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if (b!=last){
                last = b;
                if (cnt > max){
                    max = cnt;
                }
            }else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}