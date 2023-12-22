import java.util.*;
import java.io.*;

public class Main {
    public static int num(int n, int m){
        int count =0;
        for (int i =n;i<=m;i++){
            String s = String.valueOf(i);
            int a = s.charAt(0)-48;
            int b = s.charAt(1)-48;
            if (i%3==0){
                count++;
            } else if (a==3||a==6||a==9||b==3||b==6||b==9) {
                count++;
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