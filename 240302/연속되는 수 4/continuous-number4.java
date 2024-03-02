import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        int cnt = 1;
        int max = 0;
        int bigger =0;
        if (a ==1 ){
            int n = Integer.parseInt(br.readLine());
            System.out.println(1);
        }else {
            for (int i = 0; i < a; i++) {
                int b = Integer.parseInt(br.readLine());
                if (b>bigger){
                    cnt++;
                    bigger = b;
                }else {
                    if (cnt>max){
                        max = cnt;
                    }
                    bigger =0;
                    cnt =1;
                }
            }
            if (cnt>max){
                max = cnt;
            }
            System.out.println(max);
        }
    }
}