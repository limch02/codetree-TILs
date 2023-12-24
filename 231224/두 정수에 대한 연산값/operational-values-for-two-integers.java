import java.util.*;
import java.io.*;

public class Main {
    public static void bigger(int n, int m){
        if (n<m){
            System.out.println(n*2+" "+(m+25));
        }else {
            System.out.println((n+25)+" "+(m*2));
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bigger(a,b);
    }
}