import java.util.*;
import java.io.*;

public class Main {
    public static int fibo(int n,int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }return max;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringTokenizer s = new StringTokenizer(br.readLine());
        int arr [] = new int[a];
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        System.out.print(fibo(a,arr));
    }

}