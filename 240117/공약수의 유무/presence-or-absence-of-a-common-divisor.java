import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        boolean k = true;
        for (int i = a;i<=b;i++){
            if (1920%i==0&&2880%i==0){
                k = false;
            }
        }
        if (k){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}