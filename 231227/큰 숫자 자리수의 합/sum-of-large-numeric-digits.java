import java.util.*;
import java.io.*;

public class Main {
    public static int fibo(int n){
        if (n<10){
            return n;
        }
        return fibo(n/10)+n%10;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        System.out.print(fibo(a*b*c));
    }

}