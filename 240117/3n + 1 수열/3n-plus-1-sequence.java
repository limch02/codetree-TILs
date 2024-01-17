import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true){
            if (a==1){
                System.out.println(cnt);
                break;
            }
            if (a%2==0){
                a = a/2;
                cnt++;
            }else {
                a = a*3 + 1;
                cnt++;
            }
        }
    }
}