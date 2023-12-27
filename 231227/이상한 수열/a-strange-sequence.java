import java.util.*;
import java.io.*;

public class Main {
    public static int fibo(int n){
        if (n == 1){
            return 1;
        } else if (n==2) {
            return 2;
        }
        return fibo(n/3)+fibo(n-1)  ;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.print(fibo(a));
    }

}