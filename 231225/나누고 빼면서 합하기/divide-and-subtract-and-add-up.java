import java.util.*;
import java.io.*;

public class Main {
    public static int sum(int n,int m, int[] arr){
        int s = 0;
        while (m!=0){
            if (m%2==0){
                s += arr[m-1];
                m = m/2;
            }else {
                s += arr[m-1];
                m = m-1;
            }
        }
        return s;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int []arr = new int[a];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        System.out.println(sum(a,b,arr));
    }

}