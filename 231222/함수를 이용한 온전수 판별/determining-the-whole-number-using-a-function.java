import java.util.*;
import java.io.*;

public class Main {
    public static int num(int n,int m){
        int count = 0;
        for (int i =n;i<=m;i++){
            String s = String.valueOf(i);
            if (i%2!=0){
                if ((int)s.charAt(s.length()-1)-48!=5){
                    if (i%3!=0||i%9==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(num(a,b));
    }
}