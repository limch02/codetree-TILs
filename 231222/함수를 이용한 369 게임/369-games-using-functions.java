import java.util.*;
import java.io.*;

public class Main {
    public static int num(int n, int m){
        int count =0;
        for (int i =n;i<=m;i++){
            String s = String.valueOf(i);
            if (i%3==0){
                count++;
            } else {
                for (int j=0;j<s.length();j++){
                    int a = s.charAt(j)-48;
                    if (a==3||a==6||a==9){
                        count++;
                        break;
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