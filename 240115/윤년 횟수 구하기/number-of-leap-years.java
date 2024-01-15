import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i<=a;i++){
            if (i%4==0&&i%100==0&&i%400==0) {
                cnt++;
            } else if (i%4==0&&i%100!=0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}