import java.util.*;
import java.io.*;

public class Main {
    public static int sum(int n){
        if (n < 10){
            return (int) Math.pow(n,2);
        }
        return (sum(n/10) + (int) Math.pow(n%10,2));
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.println(sum(a));
    }

}