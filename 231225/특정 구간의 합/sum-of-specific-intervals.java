import java.util.*;
import java.io.*;

public class Main {
    public static void sum(int n, int m,int [] arr){
        int s = 0;
        for (int i = n-1;i<m;i++){
            s += arr[i];
        }
        System.out.println(s);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int arr [] = new int[a];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        for (int i =0;i<b;i++){
            StringTokenizer k = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(k.nextToken());
            int m = Integer.parseInt(k.nextToken());
            sum(n,m,arr);
        }
    }

}