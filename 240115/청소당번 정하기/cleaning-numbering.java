import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int acnt = 0;
        int bcnt = 0;
        int ccnt = 0;
        for (int i = 0; i<10;i++){
            if (a%3==0){
                acnt++;
            }
            if (a%4==0){
                bcnt++;
            }
            if (a % 12 == 0) {
                ccnt++;
            }
        }
        System.out.print(acnt+" "+bcnt+" "+ccnt);
    }
}