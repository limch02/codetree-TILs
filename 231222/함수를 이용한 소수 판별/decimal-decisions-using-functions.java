import java.util.*;
import java.io.*;

public class Main {
    public static int num(int n, int m){
        int sum =0;
        for (int i =n;i<=m;i++){
            int count = 0;
            for (int j =1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(num(a,b));
    }
}