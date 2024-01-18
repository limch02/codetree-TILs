import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        boolean k = false;
        for (int i =2;i<=a;i++){
            if (a%i==0){
                k = true;
            }
        }
        if (k){
            System.out.println("C");
        }else {
            System.out.println("P");
        }
    }
}