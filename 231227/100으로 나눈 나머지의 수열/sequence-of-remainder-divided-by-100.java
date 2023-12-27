import java.util.*;
import java.io.*;

public class Main {
    public static int fibo(int n){
        if (n == 1){
            return 2;
        } else if (n==2) {
            return 4;
        }
        return fibo(n-1)*fibo(n-2)%100;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.print(fibo(a));
    }

}