import java.util.*;
import java.io.*;

public class Main {
    public static void up(int n){
        if (n ==0){
            return;
        }
        up(n-1);
        System.out.print(n+" ");
    }
    public static void down(int n){
        if (n ==0){
            return;
        }
        System.out.print(n+" ");
        down(n-1);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        up(a);
        System.out.println();
        down(a);
    }

}