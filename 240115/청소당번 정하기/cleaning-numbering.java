import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int acnt = 0;
        int bcnt = 0;
        int ccnt = 0;
        for (int i = 1; i<=a;i++){
            if (i % 12 == 0) {
                ccnt++;
            } else if (i%3==0) {
                bcnt++;
            } else if (i%2==0) {
                acnt++;
            }
        }
        System.out.print(acnt+" "+bcnt+" "+ccnt);
    }
}