import java.util.*;
import java.io.*;

public class Main {
    static int cnt =0;
    public static int fibo(int n){
        if (n ==1){
            return 1;
        }
        return fibo(n-1)*n;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.println(fibo(a));
    }

}