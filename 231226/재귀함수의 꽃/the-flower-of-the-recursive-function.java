import java.util.*;
import java.io.*;

public class Main {
    public static void up(int n,int m, int [] arr){
        if (n<=m){
            return;
        }
        System.out.print(arr[n-1] + " ");
        up(n-1,m,arr);
        System.out.print(arr[n-1] + " ");
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int [] arr= new int[a];
        for (int i =1;i<=a;i++){
            arr[i-1] = i;
        }
        up(a,0,arr);
    }

}