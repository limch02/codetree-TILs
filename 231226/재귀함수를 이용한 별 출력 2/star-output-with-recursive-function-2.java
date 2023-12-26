import java.util.*;
import java.io.*;

public class Main {
    public static void up(int n,int m){
        if (n<=m){
            return;
        }
        for (int i =0;i<n;i++) {
            System.out.print("* ");
        }
        System.out.println();
        up(n-1,m);
        for (int i =0;i<n;i++) {
            System.out.print("* ");
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        up(a,0);
    }

}