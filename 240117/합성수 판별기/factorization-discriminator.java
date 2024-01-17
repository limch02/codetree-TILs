import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        boolean k = true;
        for (int i = 2;i<a;i++){
            if (a%i==0){
                k = false;
            }
        }
        if (k){
            System.out.println("N");
        }else {
            System.out.println("C");
        }
    }
}