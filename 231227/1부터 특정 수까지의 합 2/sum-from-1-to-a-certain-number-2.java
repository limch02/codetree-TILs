import java.util.*;
import java.io.*;

public class Main {
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.println(sum(a));
    }

}