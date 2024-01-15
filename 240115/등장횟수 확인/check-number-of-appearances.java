import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for (int i = 0; i<5;i++){
            int a = Integer.parseInt(br.readLine());
            if (a%2==0){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}