import java.util.*;
import java.io.*;

public class Main {
    public static int fibo(int n){
        if (n <=1){
            return n;
        }
        if (n%2==1) {
            return fibo(n-2)+n;
        }else {
            return fibo(n-2)+n;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.println(fibo(a));
    }

}