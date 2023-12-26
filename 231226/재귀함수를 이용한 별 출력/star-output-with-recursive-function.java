import java.util.*;
import java.io.*;

public class Main {
    public static void star(int n){
        if (n ==0){
            return;
        }
        star(n-1);
        for (int i =0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        star(a);
    }

}