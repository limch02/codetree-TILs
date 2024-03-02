import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        int cnt = 0;
        int max = 0;
        boolean nop = true;
        if (a ==1 ){
            int n = Integer.parseInt(br.readLine());
            System.out.println(1);
        }else {
            for (int i = 0; i < a; i++) {
                int b = Integer.parseInt(br.readLine());
                boolean t;
                if (b < 0) {
                    t = false;
                } else {
                    t = true;
                }
                if (t == nop) {
                    cnt++;
                } else {
                    if (nop) {
                        nop = false;
                    } else {
                        nop = true;
                    }
                    if (cnt > max) {
                        max = cnt;
                    }
                    cnt = 1;
                }
            }
            if (cnt>max){
                max = cnt;
            }
            System.out.println(max);
        }
    }
}