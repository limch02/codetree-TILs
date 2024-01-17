import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 1;
        while(true){
            if (a==(int)Math.pow(2,cnt)){
                System.out.println(cnt);
                break;
            }else {
                cnt++;
            }
        }
    }
}