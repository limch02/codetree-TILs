import java.util.*;
import java.io.*;

public class Main {
    public static void sum(int n){
        if (n ==0){
            return;
        }
        sum(n-1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        sum(a);
    }

}