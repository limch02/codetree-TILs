import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcnt = 0;
        int fcnt = 0;
        for (int i = 0; i<10;i++){
            int a = Integer.parseInt(br.readLine());
            if (a%3==0){
                tcnt++;
            }
            if (a%5==0){
                fcnt++;
            }
        }
        System.out.print(tcnt+" "+fcnt);
    }
}